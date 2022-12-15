package activitythirtyeight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        int calories;
        String startDate;
        String endDate;

        Scanner input = new Scanner(System.in);
        Scanner newInput = new Scanner(System.in);

        System.out.println("How many calories does the diet allow for?");
        calories = input.nextInt();
        System.out.println("When do you start your diet? mm/dd/yyyy format");
        startDate = newInput.nextLine();
        System.out.println("When do you end your diet? mm/dd/yyyy format");
        endDate = newInput.nextLine();


        totalCalories myObj = new totalCalories(calories,startDate,endDate);


    }
}
