package activity2;
/* Author: Austen Lowder
   Date: 09/02/2022
   Last updated: 09/02/2022
   Submission date: 09/08/2022
   Summary: This is an activity to show how conditionals work by taking an input
            and checking what grade the average scores are of the three inputs.
 */
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args){

        //takes in the input of the user and stores the input they type.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in the test scores like this x y z:");
        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();
        // gets the three scores and then averages them
        int average_score = (score1 + score2 + score3) / 3;
        //calls to the class ScoreChecker and inputs the stored data.
        ScoreChecker.Checker(average_score);
        ScoreChecker.Checker(score1);
        ScoreChecker.Checker(score2);
        ScoreChecker.Checker(score3);

        }
    }

    //checks the condition of the score to see what grade they will have.
class ScoreChecker{
    public static void Checker(int x){
        if(x >=90){
            System.out.println("A");
        }else if (x >= 80 && x <= 89){
            System.out.println("B");

        }else if (x >= 70 && x<=79){
            System.out.println("C");
        } else if (x >=60 && x<= 69){
            System.out.println("D");
        } else if(x < 60){
            System.out.println("F");
        }
    }
}