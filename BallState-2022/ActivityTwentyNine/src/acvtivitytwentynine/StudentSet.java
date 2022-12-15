package acvtivitytwentynine;

import java.util.*;

public class StudentSet {
    Scanner input = new Scanner(System.in);
    Scanner dumbinput = new Scanner(System.in);
    Set<String> set = new HashSet<>();
    int x = 0;
    public StudentSet() {
        addStudents();

    }
    public void addStudents() {
        System.out.println("Enter any number of students to the set or q to quit");
        try {
            x = input.nextInt();
        } catch (Exception e) {
            System.out.println("Program Exited");
            System.exit(0);
        }
        for (int i = 1; i <= x; i++) {
            System.out.println("Enter a name: ");
                set.add(dumbinput.nextLine());
            }

            displayStudents();

        }

    public void displayStudents(){
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
