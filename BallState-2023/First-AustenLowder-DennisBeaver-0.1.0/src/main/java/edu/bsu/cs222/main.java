package edu.bsu.cs222;


import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        // takes input then goes to finder to check for errors and etc.
        Scanner search = new Scanner(System.in);
        System.out.println("Provide an article name:");
        String searchValue = search.nextLine();
            new Finder(searchValue);
        }
    }