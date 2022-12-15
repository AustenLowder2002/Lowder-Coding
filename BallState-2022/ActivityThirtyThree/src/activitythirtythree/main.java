package activitythirtythree;

import java.util.Scanner;

import static activitythirtythree.BalancedBrackets.BalancedBrackets;

public class main {
    public static void main(String[] args){
    BalancedBrackets balanced = new BalancedBrackets();
    Scanner input = new Scanner(System.in);

        String test;
        System.out.println("Please enter any set of brackets");
        test = input.nextLine();
        if (BalancedBrackets(test)){
        System.out.println("Balanced");

    }else{
        System.out.println("Unbalanced");

        }
    }
}
