
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class MonteCarloPiSimulation {
    public static void main(String[] args) {
        int totalSimulations = 1000000000;

        long startTimeSingle = System.nanoTime();
        double piSingleThreaded = PiSingleThreaded(totalSimulations);
        long endTimeSingle = System.nanoTime();
        System.out.println("Estimated value of pi: " + piSingleThreaded);

        long durationSingle = TimeUnit.NANOSECONDS.toMillis(endTimeSingle - startTimeSingle);
        System.out.println("Time taken to generate: " + durationSingle);

    }
    private static double PiSingleThreaded(int totalSimulations) {
        int insideCircle = 0;
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < totalSimulations; i++) {
            double x = rand.nextDouble(-1, 1);
            double y = rand.nextDouble(-1, 1);

            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }

        return 4.0 * insideCircle / totalSimulations;
    }
}

