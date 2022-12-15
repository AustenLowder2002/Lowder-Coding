package exercises;

import java.util.Scanner;

import geometric.Triangle;

import geometric.Triangle;
import geometric.Triangle;
public class TriangleMain {

	public static void main(String[] args) {
		/* Filename: TriangleMain
		 * Author: Austen Lowder
		 * Date: 10/24/2021
		 * Summary: This calls to the triangle class which extends the geometric class to return the sides and get the perimeter and ect.
		 */
		
				double side1;
				double side2;
				double side3;
				Scanner input = new Scanner(System.in);
				// gets the sides from the user and validates input
				System.out.println("Must input postives for your sides!");
				
				do {
					System.out.print("Enter the first of three sides of your triangle: ");
					while(!input.hasNextDouble()) {
						System.out.println("That is not a number please try again.");
						input.next();
				}
					side1 = input.nextDouble();
				} while(side1 <=0);
				
				do {
					System.out.print("Please enter the next number of your triangle:");
					while(!input.hasNextDouble()) {
						System.out.println("That is not a number please try again.");
						input.next();
				}
					side2 = input.nextDouble();
				} while(side2 <=0);
				
				do {
					System.out.print("Please enter the last number of your triangle:");
					while(!input.hasNextDouble()) {
						System.out.println("That is not a number please try again.");
						input.next();
				}
					side3 = input.nextDouble();
				} while(side3 <=0);
				

				// user enters a color
				System.out.print("Enter a color: ");
				String color = input.next();

				// asks whether the triangle is filled or not
				System.out.print("Is the triangle filled (true / false)? ");
				boolean filled = input.nextBoolean();

				// makes a triangle with the parameters of side1,2,3
				Triangle triangle = new Triangle(side1, side2, side3);
				triangle.setColor(color);
				triangle.setFilled(filled);

				//displays the information
				System.out.println(triangle.toString());
				System.out.println("Area: " + triangle.getArea());
				System.out.println("Perimeter: " + triangle.getPerimeter());
				System.out.println("Color: " + triangle.getColor());
				System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
					+ " filled");
		
		
    }


	}




