package activitytwelve;
/* Author: Austen Lowder
   Date: 09/13/2022
   Last updated: 09/13/2022
   Submission date: 09/16/2022
   Summary: Creates a random class of my design that will get you the sides of a triangle and the area of a circle.
 */
import java.util.Scanner;

//imports the classes
import static activitytwelve.classesActivity.circle.circles;
import static activitytwelve.classesActivity.triangle.triangles;

public class classesActivity {
    public static void main(String[] args){
        //creates objects within triangle and circle
        triangle myObj = new triangle();
        triangles();
        myObj.displayInfo();

        circle obj = new circle();
        circles();
        obj.getArea();
    }

    //class to be called
    public static class triangle {
        //private variables
        private static int side1 = 0;
        private static int side2 = 0;
        private static int side3 = 0;

        //method for getting the sides
        static void triangles() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter side1");
            side1 = input.nextInt();
            System.out.println("Enter side2");
            side2 = input.nextInt();
            System.out.println("Enter side3");
            side3 = input.nextInt();
        }
        //method for getting the perimeter
        void perimeter(){
            double premi = side1 * side2 * side3;
            System.out.println("perimeter of triangle: " + premi);
        }
        //method for displaying the information
        void displayInfo() {
            System.out.println("Side one: " +side1);
            System.out.println("Side two: " +side2);
            System.out.println("Side three: " +side3);
            perimeter();

        }
    }

    //class for the circle
        public static class circle{
            private static double radius = 0;
            private static double area = 0;

            //method for getting the circle's radius
            static void circles(){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter radius");
                radius = input.nextInt();
            }
            //gets the area
            static void getArea(){
                area = 3.14 * Math.pow(radius,2);
                System.out.println(circle.radius);
                System.out.println(circle.area);
            }
        }

    }


