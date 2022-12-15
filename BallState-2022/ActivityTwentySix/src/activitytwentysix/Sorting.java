package activitytwentysix;

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

                int temp;
                for (int i =0; i<array.length -1; i++){

                    for (int index =0; index<array.length -i-1; index++){
                        if (array[index] > array[index+1]) {

                            temp = array[index];

                            array[index] = array[index+1];

                            array[index+1] =temp;


                        }

                    }

                }
            System.out.println("Sorted array");
            System.out.println(Arrays.toString(array));

            return array;
        }


}
