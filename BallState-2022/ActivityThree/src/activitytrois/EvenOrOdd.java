package activitytrois;
/* Author: Austen Lowder
   Date: 09/06/2022
   Last updated: 09/06/2022
   Submission date: 09/09/2022
   Summary: Takes input and then checks if it is even or odd.
 */
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        // initializes variable
        int num = 0;
        //takes user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number: ");
        num = input.nextInt();

        //compares if it has a remainder after dividing by 2
        if(num%2 == 0){
            System.out.println("It is even.");
        }else
            System.out.println("It is odd.");

    }
}
