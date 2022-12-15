package excercises;

import java.util.Scanner;

public class LargestN {

	public static void main(String[] args) {
		/* Filename: LargestNAndSmallestN
		 * Author: Austen Lowder
		 * Date: 9/18/2021
		 * Summary: This program will find the largest integer n such as n^3 is less than 12,000.
		 */
	
		
		int Ln = 0;
		
		// This finds what the largest integer is for n^3 that is less than 12000
		while(Math.pow(Ln+1, 3)<12000) {
			 Ln++;
		}
		// This just prints it out!
		System.out.println("The largest integer of n^3 that is less than 12000 is: " + Ln);
	}

}
