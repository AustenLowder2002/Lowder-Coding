package activitythirtyone;
import java.util.HashMap;
public class HashMaps {
    HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>(3);
    public HashMaps(){
        numbers.put(3,4);
        numbers.put(6,7);
        numbers.put(9,0);
        addKeyValue();
        display();
        removeKeyValue();
        display();


    }
    public void addKeyValue(){
        numbers.put(1,2);

    }
    public void removeKeyValue(){
        numbers.remove(1,2);
    }
    public void display(){
        for(Integer i: numbers.keySet()){
            System.out.printf( i + " = ");
            System.out.println(numbers.get(i));
            //numbers.get(i);

        }
        System.out.println("----------");
    }
}
