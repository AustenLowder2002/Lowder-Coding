package activitytrois;
/* Author: Austen Lowder
   Date: 09/06/2022
   Last updated: 09/06/2022
   Submission date: 09/09/2022
   Summary: Takes input and checks if the password and username matches the pre-defined variables.
 */

import javax.swing.*;

public class Login {
    public static void main(String[] args){
        //Variables for comparing
        String user = "user";
        String pass = "pass";
        String userIn;
        String passIn;

        //takes user input
        userIn = JOptionPane.showInputDialog(null, "Please input username:");
        passIn = JOptionPane.showInputDialog(null, "Please input password:");

        //checks if password and username are wrong
        if (!user.equals(userIn) && !pass.equals(passIn)) {
            JOptionPane.showMessageDialog(null, "Username and password are incorrect.");
        // checks if username and password are correct
        }else if(user.equals(userIn) && pass.equals(passIn)){
            JOptionPane.showMessageDialog(null,"Welcome to Class!");
        //checks if password is wrong
        }else if (!pass.equals(passIn)){
            JOptionPane.showMessageDialog(null,"Password is incorrect.");
        //checks if username is correct
        }else if(!user.equals(userIn)){
            JOptionPane.showMessageDialog(null,"Username is incorrect.");

        }
    }
}
