package activitytwentyeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        BinarySearch search = new BinarySearch();
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(23,17,12,90,84,38,5,77,44));
        System.out.print("Unsorted: ");
        for(int num : array){
            System.out.print(num + " ");
        }
        Collections.sort(array);
        System.out.println();
        System.out.print("Sorted: ");
        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(input.nextLine());

        int found = search.binarySearch(array, key);
        if (found == -1){
            System.out.println("Item not found");

        }else{
            System.out.printf("Item found at index %d, position %d", found, found+1);
        }
    }

}
