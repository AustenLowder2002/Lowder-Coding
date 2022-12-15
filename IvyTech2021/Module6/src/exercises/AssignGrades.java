package exercises;

import java.util.Scanner;

public class AssignGrades {

	public static void main(String[] args) {
		/* Filename: AssignGrades
		 * Author: Austen Lowder
		 * Date: 10/2/2021
		 * Summary: This program will assign grades to the given amount of students using an array.
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		// just takes the input of students
		System.out.print("Enter the number of students.");
		
		int[] scores = new int[input.nextInt()];
		
		char[] grades = new char[scores.length];
		
		
		//tells you how many scores you should enter and takes in all the scores you do enter
		
		System.out.print("Enter " + scores.length + " scores.");
		
		for(int j = 0; j < scores.length; j++) {
			scores[j] = input.nextInt();
			
		}
		
		// calls to the function getGrades using the parameters scores, grades
		getGrades(scores, grades);
		
		// displays the scores
		for (int j = 0; j < scores.length; j++) {
			System.out.println("Students " + j + " score is " + scores[j] + "and grade is " +grades[j]);
		}
	}
	// gets the literally highestSore
		public static int highestScore(int[] array) {
			int highestScore = array[0];
			// if the array[j] is greater than highestScore then highestScore becomes the value that is array[j]
			for (int j = 1; j < array.length; j++) {
				if (array[j] > highestScore) 
					highestScore = array[j];	
			}
			return highestScore;
		}
	
		
		// Gets the grades for each student and gets the highest one
		public static void getGrades(int[] scores, char[] grades) {
			int best = highestScore(scores);
			for (int j = 0; j < scores.length; j++) {
				if (scores[j] >= best -10)
					grades[j] = 'A';
				else if (scores[j] >= best -20)
					grades[j] = 'B';
				else if (scores[j] >= best -30)
					grades[j] = 'C';
				else if (scores[j] >= best -40)
					grades[j] = 'D';
				else
					grades[j] = 'F';
			}
		}
	}
		
	
