package exercises;

import java.util.ArrayList;
/* Filename: DistinctElemets
 * Author: Austen Lowder
 * Date: 11/21/2021
 * Summary: This stops duplicate arrays elements
 */

public class DistinctElements {
	public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("Hello");
            strings.add("Hello");
            strings.add("Hello");
            strings.add("Help");
            strings.add("Help");
        }

        strings = removeDuplicates(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

        ArrayList<E> newList = new ArrayList<>(list.size());
        for (E aList : list) {
            if (!newList.contains(aList)) {
                newList.add(aList);
            }
        }
        return newList;
    }
}
