package activity1;
/* Author: Austen Lowder
   Date: 09/01/2022
   Last Updated: 09/01/2022
   Submission date: 09/07/2022
   Summary: This program will take inputs using both the Scanner class and JOptionPane
   and use them to add,divide,multiply,subtract,square root, power, and log them.
 */

//imported classes to take inputs and do math
import javax.swing.*;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        //Using JOptionPane to get input from user and then display the numbers by passing to the nums.Integer class.
        double num1;
        double num2;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Please input your first number:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Please input your second number:"));

        nums.DoubleStuff(num1,num2);


        //Scanner inputs
        System.out.println("Please insert two numbers you wish to add, subtract, multiply, divide, get the square root of, the power, and the logarithm of: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number.");
        double firstNum = input.nextDouble();
        System.out.println("Please enter your second number.");
        double secondNum = input.nextDouble();
        nums.DoubleStuff(firstNum,secondNum);


    }
}

//Class to take in the numbers and display the information wanted.
class nums{
    public static void DoubleStuff(double x, double y){
        //Does all the math using basic symbols and then math classes.
        double add = x + y;
        double sub = x - y;
        double multi = x * y;
        double div = x/y;
        double sqrt1 = Math.sqrt(x);
        double sqrt2 = Math.sqrt(y);
        double power = Math.pow(x, y);
        double log1 = Math.log(x);
        double log2 = Math.log(y);

        //Displays all the info
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(sqrt1);
        System.out.println(sqrt2);
        System.out.println(power);
        System.out.println(log1);
        System.out.println(log2);

    }
}