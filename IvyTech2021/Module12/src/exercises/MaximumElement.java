package exercises;

public class MaximumElement {
	/* Filename: MaximumElement
	 * Author: Austen Lowder
	 * Date: 11/21/2021
	 * Summary: Finds the maximum element given in an array
	 */
	public static void main(String[] args) {

        Integer[] list = new Integer[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        System.out.println("Max = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[] list) {

        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            E element = list[i];
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }
}

