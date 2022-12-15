package activitynine;
/* Author: Austen Lowder
   Date: 09/13/2022
   Last updated: 09/13/2022
   Submission date: 09/16/2022
   Summary: For loops and random number generator to give you a random color and if the guess is correct adds onto it.
 */
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args){
        //Initializes variables
        String answer;
        int correctGuess = 0;
        //input taker
        Scanner input = new Scanner(System.in);
        // for loop that loops 10 times
        for(int i =1; i <= 10; i++){
            System.out.println("What color has the computer chosen?");
            answer = input.nextLine();
            // random number generator
            Random j = new Random();
            // string array that holds the value
            String[] color = new String[]{"red", "green", "blue", "orange", "yellow"};
            // selects a random element within the length of the array
            int randomNumber = j.nextInt(color.length);
            //prints out said random element
            System.out.println(color[randomNumber]);
            // if the guess is matching the element it adds one to guesses.
            if(answer.equals(color[randomNumber])){
                correctGuess += 1;
            }
        }
        System.out.println("The number of correct guesses is " + correctGuess + " out of 10.");
    }
}
