package exercisemod1;
//this is the imported class for putting decimal places on doubles
import java.text.DecimalFormat;

public class ComputeExpress {

	public static void main(String[] args) {
		// The purpose of this program is to compute (9.5*4.5)-(2.5*3)/(45.5-3.4).
		
		//These are the variables(something that holds value).
		double form;
		
		// This is the formula to be computed.
		form= (9.5*4.5)-(2.5*3)/(45.5-3.4);
		
		//this sets the precision of the double variable to 3 decimal places.
		DecimalFormat dec = new DecimalFormat("#0.000");
		
		// Displays the value of (9.5*4.5)-(2.5*3)/(45.5-3.4) pretty simple.
		System.out.println("This is the output of (9.5*4.5)-(2.5*3)/(45.5-3.4). " + dec.format(form));

	}

}
