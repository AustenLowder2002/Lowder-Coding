import java.util.concurrent.*;

public class MonteCarloPiSimulationMulti {
    public static void main(String[] args) {
        int numThreads = 4;
        int totalSimulations = 1000000000;
        long startTimeSingle = System.nanoTime();
        double piMultiThreaded = PiMultiThreaded(totalSimulations, numThreads);
        long endTimeSingle = System.nanoTime();
        System.out.println("Estimated value of pi: " + piMultiThreaded);
        long durationSingle = TimeUnit.NANOSECONDS.toMillis(endTimeSingle - startTimeSingle);
        System.out.println("Time taken to generate: " + durationSingle);
    }
    private static double PiMultiThreaded(int totalSimulations, int numThreads) {
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int simulationsPerThread = totalSimulations / numThreads;

        Future<Double>[] results = new Future[numThreads];

        for (int i = 0; i < numThreads; i++) {
            results[i] = executor.submit(new MonteCarlo(simulationsPerThread));
        }

        executor.shutdown();

        double totalInsideCircle = 0;

        for (int i = 0; i < numThreads; i++) {
            try {
                totalInsideCircle += results[i].get();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return 4.0 * totalInsideCircle / totalSimulations;
    }
}

class MonteCarlo implements Callable<Double> {
    private int simulations;

    public MonteCarlo(int simulations) {
        this.simulations = simulations;
    }

    public Double call() {
        int insideCircle = 0;
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < simulations; i++) {
            double x = rand.nextDouble(-1, 1);
            double y = rand.nextDouble(-1, 1);

            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }

        return (double) insideCircle;
    }
}

