package activityfour;
/* Author: Austen Lowder
   Date: 09/06/2022
   Last updated: 09/06/2022
   Submission date: 09/09/2022
   Summary: Switch statement activity
 */
import java.util.Scanner;

public class SwitchActivity {
    public static void main(String[] args) {
        //takes input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of one of the planet");
        String planets = input.nextLine();


        //compares the input with the cases
        switch (planets) {
            case "Mercury" -> {
                System.out.println("Distance from sun: 40.836 million miles");
                System.out.println("Planet size radius: 1,516 miles ");
            }
            case "Venus" -> {
                System.out.println("Distance from sun: 66.784 million miles");
                System.out.println("Planet size radius: 3,760.4 miles ");
            }
            case "Earth" -> {
                System.out.println("Distance from sun: 92.96 million miles");
                System.out.println("Planet size radius: 3,958.8 miles ");
            }
            case "Mars" -> {
                System.out.println("Distance from sun: 132.97 million miles");
                System.out.println("Planet size radius: 2,106.1 miles ");
            }
            case "Jupiter" -> {
                System.out.println("Distance from sun: 460.82 million miles");
                System.out.println("Planet size radius: 43,441 miles ");
            }
            case "Saturn" -> {
                System.out.println("Distance from sun: 915.6 million miles");
                System.out.println("Planet size radius: 36,184 miles ");
            }
            case "Uranus" -> {
                System.out.println("Distance from sun: 1.8295 billion miles");
                System.out.println("Planet size radius: 15,759 miles ");
            }
            case "Neptune" -> {
                System.out.println("Distance from sun: 2.78 billion miles");
                System.out.println("Planet size radius: 15,299 miles ");
            }
            case "Pluto" -> System.out.println("You sure that's a planet?");

            default -> System.out.println("Improper input.");
        }

    }
}
