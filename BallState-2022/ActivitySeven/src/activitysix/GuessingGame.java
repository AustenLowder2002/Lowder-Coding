package activitysix;
/* Author: Austen Lowder
   Date: 09/08/2022
   Last updated: 09/08/2022
   Submission date: 09/14/2022
   Summary: While loop practice validates input and then takes a guessing game.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // initializes variables
        int min = 0;
        int max = 100;
        int guesses = 0;
        //random num generator
        Random random = new Random();
        int ran = random.nextInt(1, 101);
        //takes input
        Scanner input = new Scanner(System.in);
        // initializes the booleans.
        boolean entering = true;
        boolean start = true;
        //while loop that validates the number input
        while (start = true) {
            System.out.println("Please input a number between 1 and 100 or if you wish to exit type \"q\":");
            String guess = input.nextLine();
            if (guess.equals("q")) {
                System.out.println("Quitter! The number was: " + ran);
                System.exit(0);

            } else {
                //loop that keeps track of your guesses.
                int guessInt = Integer.parseInt(guess);
                if (guessInt < 1) {
                    System.out.println("Your guess was below the minimum, please try again or q to quit: ");
                    start = false;

                } else if (guessInt > 100) {
                    System.out.println("Your guess was above the maximum, please try again or q to quit: ");
                    start = false;
                } else while (entering) {


                    if (ran == guessInt) {
                        System.out.println("Congratz that is the correct number, it took you " + guesses + " guesses");
                        System.exit(0);
                        guesses++;
                    } else if (guessInt < ran) {
                        System.out.println("The number is too low, try again.");
                        guessInt = input.nextInt();
                        guesses++;
                    } else {
                        System.out.println("The number is too high, try again.");
                        guessInt = input.nextInt();
                        guesses++;
                    }
                }


            }


        }
    }
}