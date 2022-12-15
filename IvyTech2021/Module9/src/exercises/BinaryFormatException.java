package exercises;


public class BinaryFormatException {

	public static void main(String[] args) {
		/* Filename: BinaryFormatException
		 * Author: Austen Lowder
		 * Date: 10/31/2021
		 * Summary: This throws purposely throws an exception for a binary.
		 */
		
		 System.out.println(bin2Dec("1100100"));
	      
	     System.out.println(bin2Dec("lafkja"));
	    }
		
		// throws the exception if it is not binary
	    public static int bin2Dec(String binary) throws Exception {

	        if (!isBinary(binary)) {
	            throw new Exception(binary + " is not a binary number.");
	        }
	        int power = 0;
	        int decimal = 0;
	        for (int i = binary.length() - 1; i >= 0; i--) {

	            if (binary.charAt(i) == '1') {
	                decimal += Math.pow(2, power);
	            }
	            power++;
	        }
	        return decimal;
	    }
	    
	    // sends back a true or false depending on if it is binary or not.
	    public static boolean isBinary(String binary) {

	        for (char ch : binary.toCharArray()) {
	            if (ch != '1' && ch != '0') return false;
	        }
	        return true;
	    }

	}

// The class the extends IllegalArgumentException to send back an exception
class Exception extends IllegalArgumentException {

    Exception(String s) {
        super(s);
    }
}


