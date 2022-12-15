package activitytwentyseven;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public Scanner input = new Scanner(System.in);
    public int[] array = new int[5];
    public Sorting() {
        getArray();
        sortArray(array);
    }
    public int[] getArray() {
        System.out.println("Please input five numbers that are out of order: ");

        for(int i = 0; i < 5; i++) {

            System.out.println("Number" + i + ":");
            array[i] = input.nextInt();

        }

        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(array));


        return array;
    }

    public <array> int[] sortArray(int[] array) {


        for (int i = 0; i < array.length ; i++) {

            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));

        return array;
    }


}
