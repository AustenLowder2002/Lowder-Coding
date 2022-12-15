import java.util.InputMismatchException;
import java.util.Scanner;

public class Move {
    private String moveName;
    private int movePower;
    Scanner input = new Scanner(System.in);
    Scanner newInput = new Scanner(System.in);
    public Move() {

    }

    public String getMoveName() {
        System.out.println("What is the move name or q to exit:");
        moveName = input.nextLine();
        if(moveName.equals('q')){
            System.out.println("Program exited: ");
            System.exit(0);
        }


             return moveName;
    }
    public int getMovePower() {
        try {
            System.out.println("What is the move's power or q to quit?");
            movePower = input.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Program exited: ");
                System.exit(0);

            }

        return movePower;
    }
}