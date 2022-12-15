package activityfourteen;
/* Author: Austen Lowder
   Date: 09/25/2022
   Last updated: 09/25/2022
   Submission date: 09/25/2022
   Summary: Triangle class.
 */
import java.util.Scanner;

public class triangles {
    // private variables
    Scanner input = new Scanner(System.in);
    private int side1;
    private int side2;
    private int side3;

    //methods
    public triangles(int a, int b, int c){
        this.side1= a;
        this.side2= b;
        this.side3= c;
    }
    public void triangleside(int a){
        this.side1 =a;

    }
    public int getSide1(int a){
        side1 = a;
        return side1;

    } public int getSide2(int b){
        side2 = b;
        return side2;

    } public int getSide3(int c){
        side3 = c;
        return side3;

        //overloads
    }public static void overload(int a, int b, int c){
        int prem = a + b + c;
        System.out.println(prem);
    }
    public static void overload(int a, int b){
        int twoSide = a + b;
        System.out.println(twoSide);

    }
}
