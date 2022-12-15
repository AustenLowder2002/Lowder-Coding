package activity2;
/* Author: Austen Lowder
   Date: 09/02/2022
   Last updated: 09/02/2022
   Submission date: 09/08/2022
   Summary: This is an activity to show how conditionals work and
            to show how many points one person has earned for books purchased within a month.
 */

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args){
        //defining variables.
        int purchases;
        int points = 0;
        //takes input and stores it.
        Scanner input = new Scanner(System.in);
        System.out.println("How many books have you purchased this month?");
        purchases = input.nextInt();

        // conditionals for how many points one person has earned.
        if (purchases == 0){
            points = 0;
        } else if (purchases == 1){
            points = 5;
        } else if(purchases == 2){
           points = 15;
        } else if(purchases == 3){
            points = 30;
        } else if(purchases >= 4){
            points = 60;
        }

        System.out.println("Congrats you earned " + points + " points!");



    }

}
