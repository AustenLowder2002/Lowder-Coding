package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {

	public static void main(String[] args) {
		/* Filename: SumArrayList
		 * Author: Austen Lowder
		 * Date: 10/24/2021
		 * Summary: This gets 5 numbers from the user stores them in an array and then adds the sums
		 */
		boolean isNumber;
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Double> list = new ArrayList<Double>();
		
		
		for (int i = 0; i < 5; i++) {
			
			
		do {
			System.out.print("Please enter the five numbers: ");
			while(!in.hasNextDouble()) {
				System.out.println("That is not a number please try again: ");
				in.next();
		}
			list.add(in.nextDouble());
			isNumber = true;
		} while(isNumber=false);
		
		}
		
		System.out.println("Sum of list: " + sum(list));
		
	}
		
		public static double sum(ArrayList<Double> list) {
			double sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i);
			}
			return sum;
	}

}

