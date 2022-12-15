package exercises;

public class AccountClass {

	public static void main(String[] args) {
		/* Filename: AccountClass
		 * Author: Austen Lowder
		 * Date: 10/9/2021
		 * Summary: This is an account class that contains the required information from the book
		 */
			
		
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500.0);
		account.deposit(3000.0);
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Mothnly Interest: "+ account.getMonthlyInterest());
		System.out.println("Date Created: "+ account.getDateCreated());
		
		
	}

}
// This is the main class that states all the fields

class Account {
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private java.util.Date dateCreated;
	
	public Account() {
		dateCreated = new java.util.Date();
	}

// this the class Account

public Account(int id, double balance) {
	this();
	this.id = id;
	this.balance = balance;
}

//Gets the id
public int getId() {
	return this.id;
}

// gets the balance
public double getBalance() {
	return this.balance;
}

//gets the annual interest

public double getAnnualInterestRate() {
	return annualInterestRate;
}

//returns the date the account was created

public String getDateCreated() {
	return this.dateCreated.toString();
}

//sets the id to the account

public void setId(int id) {
	this.id = id;
}

//sets the balance to a value

public void setBalnce(double balance) {
	this.balance = balance;	
}

// sets the annual interest rate

public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}

// gets the monthly interest rate using the equation in the return statement

public double getMonthlyInterestRate() {
	return (annualInterestRate / 100) / 12;
}

// uses an equation to get what the monthly interest would be

public double getMonthlyInterest() {
	return balance * getMonthlyInterestRate();
}

// method for withdrawing money

public void withdraw(double amount) {
	this.balance -= amount;
}

//method for depositing money

public void deposit(double amount) {
	this.balance += amount;
}

}