package activityeleven;
/* Author: Austen Lowder
   Date: 09/25/2022
   Last updated: 09/25/2022
   Submission date: 09/25/2022
   Summary: Calls methods for a rectangle.
 */
import java.util.Scanner;

public class MethodActivity {
    public static void main(String[] args) {

        //methods that are used.
        getLength();
        getWidth();
        displayData();
}
// the variables needed
    static int recL = 0;
    static Scanner input = new Scanner(System.in);
    static int recW = 0;

    double area;


    //gets the length
    static void getLength() {
        System.out.println("What is the length of the rectangle?");
        recL = input.nextInt();
    }
    //gets the width
    static void getWidth() {
        System.out.println("What is the width of the rectangle?");
        recW = input.nextInt();
    }

    //gets the area
    static double getArea() {
        double area = (double) recW * recL;
        System.out.println("rectangle area: " +area);
        return area;
    }
    //displays all the information.
    static void displayData() {
        System.out.println("rectangle length: " + recL);
        System.out.println("rectangle width: " + recW);
        getArea();
    }
}
