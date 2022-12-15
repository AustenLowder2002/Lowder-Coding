package activityfive;
/* Author: Austen Lowder
   Date: 09/06/2022
   Last updated: 09/06/2022
   Submission date: 09/12/2022
   Summary: Takes inputs and checks them against if statements to see if they are vegan, vegetarian, or gluten allergic.
 */
import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args){
        //variable initialization
        String vege;
        String vegan;
        String gluten;
        //User input
        Scanner input = new Scanner(System.in);
        System.out.println("Is anyone in your party vegetarian?");
        vege = input.nextLine();
        System.out.println("Is anyone in your party vegan?");
        vegan = input.nextLine();
        System.out.println("Does anyone in your party have a gluten allergy?");
        gluten = input.nextLine();

        //compares input to what and where you can eat.
        if(vege.equals("Yes") && vegan.equals("Yes") && gluten.equals("Yes")){
            System.out.println("Restaurants you can eat at: The Chef’s Kitchen, Corner Café.");

        }else if(vege.equals("Yes") && vegan.equals("No") && gluten.equals("No")){
            System.out.println("Restaurants you can eat at: Mama’s Fine Italian, Corner Café, Main Street Pizza Company and, The Chef’s Kitchen. ");
        } else if(vege.equals("No") && vegan.equals("No") && gluten.equals("No")){
            System.out.println("Restaurants you can eat at: Mama’s Fine Italian, Corner Café, Main Street Pizza Company, Joe’s Gourmet Burgers, and The Chef’s Kitchen. ");
        }else if(vege.equals("No") && vegan.equals("No") && gluten.equals("Yes")){
            System.out.println("Restaurants you can eat at: The Chef’s Kitchen, Corner Café, and Main Street Pizza Company.");
        }else if(vege.equals("No") && vegan.equals("Yes") && gluten.equals("No")){
            System.out.println("Restaurants you can eat at: The Chef’s Kitchen, Corner Café.");
        }
    }
}
