package excercises;

import java.util.Scanner;

public class SortThreeNumbers {

	public static void main(String[] args) {
		/* Filename: SortThreeNumbers
		 * Author: Austen Lowder
		 * Date: 9/25/2021
		 * Summary: This program will sort three numbers that the user gives, using a class.
		 */
		
		
		
		// This are my variables for taking input
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		// this is just a normal scanner input
		Scanner input = new Scanner(System.in);
		// This is a boolean to make sure the input is a number any number
		boolean isNumber;
		
		System.out.println("You will enter three numbers that will be sorted.");
		
		// Three do while loops that make sure the input is a number
		
		do {
			System.out.print("Please enter your first number.");
			while(!input.hasNextDouble()) {
				System.out.println("That is not a number please try again.");
				input.next();
		}
			num1 = input.nextDouble();
			isNumber = true;
		} while(isNumber = false);
	
		
		do {
			System.out.print("Please enter your next number.");
			while(!input.hasNextDouble()) {
				System.out.println("That is not a number please try again.");
				input.next();
		}
			num2 = input.nextDouble();
			isNumber = true;
		} while(isNumber = false);
		
		do {
			System.out.print("Please enter your last number.");
			while(!input.hasNextDouble()) {
				System.out.println("That is not a number please try again.");
				input.next();
		}
			num3 = input.nextDouble();
			isNumber = true;
		} while(isNumber = false);
		
		// displays the numbers sorted
		displaySortedNumbers(num1, num2, num3);
		
	}
	
	// the class that sorts and displays the numbers
	
	public static void displaySortedNumbers(
			double number1, double number2, double number3) {
			double temp;
		if( number2 < number1 && number2 < number3) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		else if (number3 < number1 && number3 < number2) {
			temp = number1;
			number1 = number3;
			number3 = temp;
		}
		if (number3 < number2) {
			temp = number2;
			number2 = number3;
			number3 = temp;
		}
		
		
		System.out.println(number1 + " " + number2 + " " + number3);
		
	}

}
