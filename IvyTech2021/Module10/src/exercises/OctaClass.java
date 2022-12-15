package exercises;
import Classes.Octagon;
public class OctaClass {

	 public static void main(String[] args) throws CloneNotSupportedException {
			/* Filename: OctaClass
			 * Author: Austen Lowder
			 * Date: 11/7/2021
			 * Summary: Makes an octagon and then a clone and compares
			 */
		 
			Octagon oct1 = new Octagon(5);

			//displays area and perimeter
			System.out.println("\nOctagon:\nArea: " + oct1.getArea() + 
				"\nPerimeter: " + oct1.getPerimeter());

			//Clones the octagon then compares it to its clone
			System.out.println("Cloning Octagon...");
			Octagon oct2 = (Octagon)oct1.clone();

			//compares the octagon
			int result = (oct1.compareTo(oct2));
			if (result == 1)
				System.out.println("Octagon is greather than its clone.");
			else if (result == -1)
				System.out.println("Octagon is less than its clone."); 
			else
				System.out.println("Octagon is equal to its clone.");
		}
	}


