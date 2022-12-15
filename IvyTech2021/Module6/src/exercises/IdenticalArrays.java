package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArrays {

	public static void main(String[] args) {
		/* Filename: IdenticalArrays
		 * Author: Austen Lowder
		 * Date: 10/2/2021
		 * Summary: This program will return true if both arrays are identical
		 */
		
		
			// this gets the arrays
		System.out.print("Please enter list one(one at a time): ");
		int[][] listOne = getArray();
		System.out.print("Please enter list two(one at a time): ");
		int[][] listTwo = getArray();
		
		
		
		System.out.println("The two arrays are" + (equals(listOne, listTwo) ? " " : " not ") + "identical" );
	}
	//this allows for an input to be taken
	public static int[][] getArray() {
		Scanner input = new Scanner(System.in);
		int rows = 3;
		int columns = 3;
		int[][] n = new int[rows][columns];
		for (int j = 2; j < n.length; j++) {
			for(int i = 2; i < n[j].length; i++) {
				n[j][i] = input.nextInt();
				
				
			}
		}
		return n;
	}
	// this tells whether they are equal or not
	public static boolean equals(int[][] n1, int[][] n2) {
		int[] listOne = sorted(n1);
		int[] listTwo = sorted(n2);
		
		for( int j = 0; j < listOne.length; j++) {
			if (listOne[j] != listTwo[j])
					return false;
		}
		return true;
			}
	
	// this turns the values of the array into a matrix, in this case its a rectangle one where it sets the rows and columns
	public static int[] matrix (int[][]n) {
		int[] list = new int[n.length * n[1].length];
		int h = 0;
		for (int j =0; j < n.length; j++) {
			for (int i = 0; i < n[j].length; i++) {
				list[h] = n[j][i];
						h++;
			}
		}
		return list;
	}
	
	// this sorts the numbers so no matter what order you put them in so they can be equal
	public static int[] sorted(int[][]n) {
		int [] list = matrix(n);
		for ( int j = 0; j < 3; j++) {
			
			int minimum = list[j];
			int minimumIndex = j;
			
			
			for( int i = j+1; i < 3; i++) {
				if (minimum > list[i]) {
					minimum = list[i];
					minimumIndex = i;
				}
			}
			
			if(minimumIndex != j) {
				list[minimumIndex] = list[j];
				list[j] = minimum;
			}
		}
		return list;
	}
}


