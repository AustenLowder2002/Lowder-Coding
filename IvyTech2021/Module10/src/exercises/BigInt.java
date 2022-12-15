package exercises;

import java.math.BigInteger;
import java.util.Scanner;

import Classes.Rational;

public class BigInt {

	public static void main(String[] args) {
		/* Filename: BigInt
		 * Author: Austen Lowder
		 * Date: 11/7/2021
		 * Summary: This gets takes the input for a rational number and uses the class rational.
		 */
		
		
		/* This is all rather ugly, I could not get it to work quite right. However it does function just a little differently 
		instead it prompts the user to input the num and denom for each of their rational numbers.
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		
			System.out.print("Enter the numerator for your first rational number:");
			
			BigInteger n = scanner.nextBigInteger();
			
		
		
			System.out.print("Enter the denominator for your first rational number:");
			
		
			BigInteger b = scanner.nextBigInteger();
			
		
		
			System.out.print("Enter the numerator for your second rational number:");
		
			BigInteger c = scanner.nextBigInteger();
			
		
		
			System.out.print("Enter the denominator for your second rational number:");
			
			BigInteger d = scanner.nextBigInteger();
			


		
		Rational r1 = new Rational(BigInteger(n), BigInteger(b));
		Rational r2 = new Rational(BigInteger(c), BigInteger(d));
		
		
		
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
			}

	private static BigInteger BigInteger(BigInteger n) {
		// Just makes BigInteger something to pass a variable into.
		return n;
	}

	}


