package exercises;

import java.util.Scanner;

/* Filename: The Lottery
 * Author: Austen Lowder
 * Date: 9/5/2021
 * Summary: This program gets a random 3 digit number and uses it as a "lottery ticket"
 * Then you enter a three digit number and it compares it to the "ticket" number
 * to see if you guessed correctly, matching one digit is $1,000, matching 3 is $3,000
 * matching exact is $10,000.
 */

public class TheLottery {

	public static void main(String[] args) {
		// This program generates a random number and you try to match the number.
		
		int lotteryTicket = (int) (Math.random() * 1000);
		// Gets user input.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		
		
		// Checks to make sure guess is a three digit number.
		if(guess >= 1000 ) {
			System.out.println("Please enter a three digit number.");
			guess = input.nextInt();
		} 
		
		// Retrieve the digits from the lottery ticket.
		
		int lotteryTDigit1 = lotteryTicket /100;
		int lotteryTDigit2 = (lotteryTicket % 100) / 10;
		int lotteryTDigit3 = lotteryTicket %10;
		
		//Retrieve the digits from your guess
		int guessDigit1 = guess/100;
		int guessDigit2 = (guess %100) / 10;
		int guessDigit3 = guess % 10;
		
		System.out.println("The lottery number is " + lotteryTicket + ".");
		
		// If statement to compare whether the digits match or not.
		if(guess == lotteryTicket) {
			System.out.println("Exact match: you win $10,000");
			// these statements compare one digit to another and see if they match or not, this shows all ways it can match.
		}else if((guessDigit1 == lotteryTDigit2 && guessDigit2 == lotteryTDigit1 && guessDigit3 == lotteryTDigit3)
                || (guessDigit1 == lotteryTDigit2 && guessDigit1 == lotteryTDigit3 && guessDigit3 == lotteryTDigit1)
                || (guessDigit1 == lotteryTDigit3 && guessDigit2 == lotteryTDigit1 && guessDigit3 == lotteryTDigit2)
                || (guessDigit1 == lotteryTDigit3 && guessDigit2 == lotteryTDigit2 && guessDigit3 == lotteryTDigit1)
                || (guessDigit1 == lotteryTDigit1 && guessDigit2 == lotteryTDigit3 && guessDigit3 == lotteryTDigit2)) { 
			System.out.println("Match all digits: you win $3,000");
			// this one sees if one digit matches another
		}else if (guessDigit1 == lotteryTDigit1 || guessDigit1 == lotteryTDigit2 ||
                  guessDigit1 == lotteryTDigit3 || guessDigit2 == lotteryTDigit1 ||
                  guessDigit2 == lotteryTDigit2 || guessDigit2 == lotteryTDigit3 ||
                  guessDigit3 == lotteryTDigit1 || guessDigit3 == lotteryTDigit2 ||
                  guessDigit3 == lotteryTDigit3){
			System.out.println("Match one digit: you win $1,000");
		}else {
			System.out.println("Sorry, no match");
	}
		
		
		
		
		
		
		
	}

}
