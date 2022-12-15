package exercises;

import java.util.Scanner;

/* Filename: The Lottery
 * Author: Austen Lowder
 * Date: 9/5/2021
 * Summary: This program tells you the future day from the day you enter. (0-6)
 * It will then output the day you said and what the new day would be from the time
 * that has elapsed.
 */

import java.lang.String;

public class FutureDate {

	public static void main(String[] args) {
		// the point of this program is to give back the future date from the day you stated.
		
		int eday;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's day.(0 is Sunday so on until Saturday which is 6)");
		int tday = input.nextInt();
		
		
		// a simple if and else statement to determine whether a number was within the domain was entered.
		if (tday > 6) {
			System.out.println("Please enter a number that is between 0 and 6.");
			System.out.println("Please try again.");
			
			tday = input.nextInt();
			
			
			System.out.println("Enter the number of days after today for the future date!");
			
			
			eday = input.nextInt();
			
			
		} else if (tday <0 ) {
			System.out.println("Please enter a number between 0 and 6.");
			System.out.println("Please try again.");
			
			tday = input.nextInt();
			
			System.out.println("Enter the number of days after today for the future date!");
			
			eday = input.nextInt();
			
		} else {
			
			
			System.out.println("Enter the number of days after today for the future date!");
			// this is another variable it takes the input for elapsed days
			
			eday = input.nextInt();
		
		}
		
		
		
		
		// this is a variable that will convert the number into string
		String dayName = convertToString(tday);
		
		// this is what tells the future day.
		int futureday = (tday + eday) %7;
		
		//this is just an output statement. it tells you what today is and what the future day will be.
		System.out.println("Today is " + dayName + " and the future day is " + convertToString(futureday));
		
		
	}
		



	// will convert the number to a string.
	private static String convertToString(int tday) {
		String whichDay = "";
		
		// this will change the output from being a number so Today is 0 to Today is Sunday.
		switch(tday) {
		case 0: whichDay ="Sunday";
				break;
		case 1: whichDay ="Monday";
				break;
		case 2: whichDay ="Tuesday";
				break;
		case 3: whichDay ="Wednesday";
				break;
		case 4: whichDay ="Thursday";
				break;
		case 5: whichDay ="Friday";
				break;
		case 6: whichDay ="Saturday";
				break;
		}
		
		return whichDay;
	}

}
