package activity1;
/* Author: Austen Lowder
   Date: 09/01/2022
   Last Updated: 09/01/2022
   Submission date:09/07/2022
   Summary: This program will take inputs using both the Scanner class and JOptionPane
   and use them to get the first and last name of the user and capitalize it, lowercase it,
   and reverse the order of the letters.
 */
import javax.swing.*;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        //Defining variables
        String firstName;
        String lastName;
        String name;
        //Uses dialog options to display information
        name = JOptionPane.showInputDialog("What is your first and last name?");
        //makes it uppercase
        String upper = name.toUpperCase();
        //makes the input lowercase
        JOptionPane.showMessageDialog(null, upper);
        String lower = name.toLowerCase();
        JOptionPane.showMessageDialog(null, lower);
        //reverses it in upper case
        JOptionPane.showMessageDialog(null, formatting.reverseName(upper));
        //reverses it in lower case
        JOptionPane.showMessageDialog(null, formatting.reverseName(lower));

        //Taking input and asking for said input
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        firstName = input.nextLine();
        System.out.println("What is your last name?");
        lastName = input.nextLine();

        //Prints in upper case
        String upperF = firstName.toUpperCase();
        System.out.println(upperF);
        String upperL = lastName.toUpperCase();
        System.out.println(upperL);

        //Prints in lower case
        String lowerF = firstName.toLowerCase();
        System.out.println(lowerF);
        String lowerL = lastName.toLowerCase();
        System.out.println(lowerL);

        //Prints in reverse
        System.out.println(formatting.reverseName(firstName));
        System.out.println(formatting.reverseName(lastName));
    }
}

class formatting{
    public static String reverseName(String str){
        StringBuilder backwardString = new StringBuilder(str);
        backwardString.reverse();
            return backwardString.toString();
    }
}
