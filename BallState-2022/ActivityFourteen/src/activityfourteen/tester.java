package activityfourteen;
/* Author: Austen Lowder
   Date: 09/25/2022
   Last updated: 09/25/2022
   Submission date: 09/25/2022
   Summary: Calls to a class to try to use an overload function and etc.
 */
import activityfourteen.triangles;
public class tester {
    public static void main(String[] args){
        triangles tri3 = new triangles(1,2,3);

        //calls three methods doesn't do exactly what it should
        System.out.println("get side1:" + tri3.getSide1(1));
        System.out.println("get side2:" + tri3.getSide1(2));
        System.out.println("get side3:" + tri3.getSide1(3));

    }
}
