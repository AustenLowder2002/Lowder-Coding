package activitytrois;
/* Author: Austen Lowder
   Date: 09/06/2022
   Last updated: 09/06/2022
   Submission date: 09/09/2022
   Summary: Checks to see what kind of triangle you have inputted.
 */
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args){
        // Three sides variables
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        //takes input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three sides of a triangle:");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();

        //compares all three sides to see if they match
        if(side1 == side2 && side2 == side3 ){
            System.out.println("Equilateral triangle: All sides are equal.");
            //compares all sides to see if they don't match at all
        }else if(side1!=side2 && side2!=side3 && side3!=side1){
            System.out.println("Scalene triangle: All sides have different lengths,");
            //compares two sides
        }else if(side1==side2 || side2==side3 || side3==side1){
            System.out.println("Isosceles triangle: Two sides have the same length.");

        }else{
            System.out.println("Not a triangle");

        }
    }
}
