

package exercises;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDates {

	public static void main(String[] args) {
		/* Filename: MyDate
		 * Author: Austen Lowder
		 * Date: 10/9/2021
		 * Summary: This is an account class that contains the required information from the book
		 */
		 MyDate oDay = new MyDate();
	     MyDate fDay = new MyDate(34355555133101L);
	     
	     System.out.println("Month/Day/Year");
	     System.out.println("Original Day: " + oDay.getMonth() + "/" + oDay.getDay() + "/" + oDay.getYear());
	     System.out.println("Future Date: " + fDay.getMonth() + "/" + fDay.getDay() + "/" + fDay.getYear());


	}
}
	
// class for the MyDate
	class MyDate {
	
		private int year;
		private int month;
		private int day;
	
public MyDate() {
		GregorianCalendar cal = new GregorianCalendar();
		
//use this instead of what is set if you want the current date
		year = cal.get(Calendar.YEAR);
    	month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);
// use this for any other date you want 
//		year = 1970;
//		month = 0;
//		day = 1;
				
	}
//for the elapsed time
public MyDate(long elapsedTime) {
	 GregorianCalendar cal = new GregorianCalendar();
     cal.setTimeInMillis(elapsedTime);
     year = cal.get(Calendar.YEAR);
     month = cal.get(Calendar.MONTH);
     day = cal.get(Calendar.DAY_OF_MONTH);
}
// takes in what the year is
public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
}
	
	//gets the year
public int getYear()
{
		return year;
	}
// sets the year
public void setYear(int year) {
	this.year = year;
}
//gets the month
public int getMonth() {
	return month + 1;
}
//sets the month
public void setMonth(int month) {
	this.month = month;
}
//gets the day
public int getDay() {
	return day;
}
//sets the day
public void setDay(int day) {
	this.day = day;
}
// this helps set the date for elapsed time
public void setDate(long elaspedTime) {
	GregorianCalendar cal = new GregorianCalendar();
	cal.setTimeInMillis(elaspedTime);
	year = cal.get(Calendar.YEAR);
    month = cal.get(Calendar.MONTH);
    day = cal.get(Calendar.DAY_OF_MONTH);
}
}