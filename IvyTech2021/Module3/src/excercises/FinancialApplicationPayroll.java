package excercises;

// formats decimals to certain decimal point.
import java.text.DecimalFormat;
import java.util.Scanner;
// I am using it to compare string to your input
import java.util.regex.*;

public class FinancialApplicationPayroll {

	public static void main(String[] args) {
		/* Filename: FinancialApplicationPayroll
		 * Author: Austen Lowder
		 * Date: 9/10/2021
		 * Summary: This reads the following information and prints a payroll statement.
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		
		String nameF = " ";
		
		// uses a regex pattern to check and make sure your name is entered properly "Austen".
	
		do {
			System.out.println("Please put your first name.");
			while(!sc.hasNext("[A-Za-z]*")) {
				System.out.println("Please enter your name properly.");
				nameF = sc.next();
				boolean b = Pattern.matches("[A-Za-z]", nameF);
		}
			
		} while(false);
		
		
		
		// statements to remind the users to enter positive values.
					System.out.println("Make sure to enter all positive values!");
					System.out.println(" ");
		
		
		
		// declared variables
		double hoursWorked;
		double hourlyPay;
		double federalTax;
		double salesTax;
		
		
		// Next four statements are practically the same and do about the same, make sure that you enter a positive number and an integer.
		do {
			System.out.println("Enter number of hours worked in a week:");
			while(!input.hasNextInt()) {
				System.out.println("That is not a number please try again.");
				input.next();
		}
			hoursWorked = input.nextDouble();
		} while(hoursWorked <=0);
		
		
		do {
			System.out.println("Enter hourly pay rate:");
			while(!input.hasNextDouble()) {
				System.out.println("That is not a number please try again.");
				input.next();
		}
			hourlyPay = input.nextDouble();
		} while(hourlyPay <=0);
		
		
		do {
			System.out.println("Enter federal tax withholding rate:");
			while(!input.hasNextDouble()) {
				System.out.println("That is not a number please try again.");
				input.next();
		}
			federalTax = input.nextDouble();
		} while(federalTax <=0);
		
		
		do {
			System.out.println("Enter state tax withholding rate:");
			while(!input.hasNextDouble()) {
				System.out.println("That is not a number please try again.");
				input.next();
		}
			salesTax = input.nextDouble();
		} while(salesTax <=0);

		// calculations for the pay information
		double grossPay = (hourlyPay * hoursWorked);
		double fedDed = federalTax*grossPay;
		double stateDed = salesTax*grossPay;
		double totalDed = (federalTax*grossPay)+(salesTax*grossPay);
		double netPay = (grossPay - totalDed);
		
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		// Outputs the information that this lesson requires.
		System.out.println("Employee Name: "+ nameF);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Pay Rate: " + "$"+ hourlyPay);
		System.out.println("Gross Pay: " + "$"+ dec.format(grossPay));
		System.out.println("Deductions:");
		System.out.println("  " + "Federal Witholding " + "("+federalTax*100+"%): " + "$"+dec.format(fedDed));
		System.out.println("  " + "Federal Witholding " + "("+salesTax*100+"%): " + "$"+dec.format(stateDed));
		System.out.println("  " + "Total Deuction: " + "$"+(dec.format(fedDed+stateDed)));
		
		
	}

	
	
	
	
}
