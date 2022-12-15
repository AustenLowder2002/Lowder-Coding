package exercises;

import java.io.*;
import java.util.*;

public class TextFile {

	public static void main(String[] args) throws Exception, FileNotFoundException {
		/* Filename: BinaryFormatException
		 * Author: Austen Lowder
		 * Date: 10/31/2021
		 * Summary: Reads the scores from a file and processes it.
		 */
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a file that contains the scores: ");
		File file = new File(input.nextLine());
		
			if (!file.exists()) {
				System.out.println("File " + file + " does not exist.");
				System.exit(1);
			}
		
		
		int count = 0;
		double total = 0;
		
		try (Scanner inputFile = new Scanner(file);){
			while (inputFile.hasNext()) {
				total += inputFile.nextInt();
				count++;
		}
	}
		System.out.println("File:" + file.getName());
		System.out.println("Total scores: " + total);
		System.out.println("Average scores: " + (total / count));
	}
}
