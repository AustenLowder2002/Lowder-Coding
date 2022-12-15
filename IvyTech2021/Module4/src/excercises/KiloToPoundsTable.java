package excercises;

import java.text.DecimalFormat;

public class KiloToPoundsTable {

	public static void main(String[] args) {
		/* Filename: KiloToPoundsTable
		 * Author: Austen Lowder
		 * Date: 9/16/2021
		 * Summary: This program will create a table for the conversions of pounds to kilos, after an increment of 2
		 */
		
		// the "final" tag makes it a constant in this program
		final double KTP = 2.2;
		System.out.println("----------------------");
		System.out.println("Kilograms      |Pounds");
		System.out.println("----------------------");
		// Decimal format, formats decimals numbers or doubles to be to a certain precision.
		DecimalFormat dec = new DecimalFormat("#0.0");
		
		// This does the increment of two, if you look at the last j statement within the for's parameters, you'll see j+=2. That increments it.
		for(int j = 1; j <=199; j+=2) {
			double temp = j * KTP;
			System.out.printf("%-15s%-15s%n", j,"|"+(dec.format(temp)));
			System.out.println("----------------------");
		}

	}

}
