package activitysix;
/* Author: Austen Lowder
   Date: 09/07/2022
   Last updated: 09/07/2022
   Submission date: 09/12/2022
   Summary: Uses a loop to find the number of floors in a hotel and tells you the vacant rooms, occupied rooms,
   and the occupancy rate.
 */
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {

        //declared variables
        int floors = 0;
        int rooms = 0;
        int occupied = 0;
        int vacant = 0;
        int totalRooms = 0;
        int totalOccupied = 0;
        double occupancyRate = 0;

        //takes input
        Scanner input = new Scanner(System.in);
        System.out.println("How many floors does the hotel have?");
        floors = input.nextInt();


        //loops for all i until i is greater than.
        for (int i = 1; i <= floors; i++) {
            System.out.println("Enter the number of rooms on floor " + i + ".");
            rooms = input.nextInt();
            totalRooms += rooms;
            System.out.println("How many of the floor's rooms are occupied?");
            occupied = input.nextInt();
            totalOccupied += occupied;

        }

        //changes total rooms and total occupied to doubles
        Double d = Double.valueOf(totalOccupied);
        Double d2 = Double.valueOf(totalRooms);


        //does math
        vacant = totalRooms - totalOccupied;
        occupancyRate = d / d2;

        //displays information
        System.out.println("Number of floors: " + floors);
        System.out.println("Number of rooms: " + totalRooms);
        System.out.println("Number of occupied rooms: " + totalOccupied);
        System.out.println("Number of vacant rooms: " + vacant);
        System.out.println("Occupancy rate for the hotel: " + occupancyRate);
    }

}
