package activitythirty;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5);
        //ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        //ArrayList<Character> charArrayList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E');
        //ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        GenericMethods generic = new GenericMethods();
        ArrayList<Integer> INT = new ArrayList<Integer>(5);
        Collections.addAll(INT, 1, 2,3,4,5);
        ArrayList<Double> DOUBLE = new ArrayList<Double>(5);
        Collections.addAll(DOUBLE, 1.1, 2.2, 3.3, 4.4, 5.5);
        ArrayList<Character> CHAR = new ArrayList<Character>(5);
        Collections.addAll(CHAR, 'A', 'B', 'C', 'D', 'E');
        ArrayList<String> STRING = new ArrayList<String>(5);
        Collections.addAll(STRING, "Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        System.out.print("Integer array: ");
        generic.printArray(new ArrayList[]{INT});
        System.out.print("Double array: ");
        generic.printArray(new ArrayList[]{DOUBLE});
        System.out.print("Char array: ");
        generic.printArray(new ArrayList[]{CHAR});
        System.out.print("String array: ");
        generic.printArray(new ArrayList[]{STRING});

    }
}
