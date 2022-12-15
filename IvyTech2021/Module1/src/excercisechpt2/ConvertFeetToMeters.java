package excercisechpt2;
//What allows for an input to be taken.
import java.util.Scanner;

public class ConvertFeetToMeters {

	public static void main(String[] args) {
		// This program converts any amount of feet to meters.
		
		//Variables
		double mete=0.305;
		double meters;
		double feet;
		
		try (// this is how the system takes an input 
		Scanner inFeet = new Scanner(System.in)) {
			// this displays the message stated.
			System.out.println("Please enter any amount of feet to be converted to meters.");
			// this is how the input from the user is stored.
			feet=inFeet.nextDouble();
		}
		// this is how you convert feet to meters.
		meters = (feet*mete);
		
		// this displays the meters and the message stated.
		System.out.println("With the amount of feet stated this is how many meters it is "+ meters );
		

	}

}
