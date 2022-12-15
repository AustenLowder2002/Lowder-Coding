package excercises;

import java.util.Scanner;

import java.lang.Math;
import java.text.DecimalFormat;

public class AreaOfPentagon {

	public static void main(String[] args) {
		/* Filename: AreaOfPentagon
		 * Author: Austen Lowder
		 * Date: 9/11/2021
		 * Summary: This program will use the number you provide for the vertex and find the Area and the side of a pentagon.
		 */
		
		
		
		// this takes in the input the user puts.
		Scanner input = new Scanner(System.in);
		
		double v;
		
		// this validates the integer you've put in. This makes sure it falls under the standard of double. Mainly that it is a number
		do {
			System.out.println("Please enter the length from the center to a vertex of the pentagon.(Must be positive)");
			while(!input.hasNextDouble()) {
				System.out.println("That is not a number please try again.");
				input.next();
			}
			v = input.nextDouble();
		} while(v <= 0 );
		
		// this is the formula for the side
		double s = 2*(v)*Math.sin(Math.PI/5);
		
		// this is the formula for the area
		double area = 5*(Math.pow(s, 2))/(4*Math.tan(Math.PI/5));
		
		// this formats the decimal to 2 decimal points.
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		// these statements prints out the area and side of the pentagon
		System.out.println("The area of thhe pentagon is " +dec.format(area));
		
		System.out.println("The side of the pentagon is " +dec.format(s));
	}
	

}
