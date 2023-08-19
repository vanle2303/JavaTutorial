package tutorials.tutorials15_collections.list;

import java.util.ArrayList;

/**
 * This class demos the use of method toArray(), which is converts a list into a real array for the purpose of convenience.
 * For example, the method can be used like this:
 *      intArray = intArrayList.toArray(intArray);
 */

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>(4);
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        System.out.println("Content of intArrayList: " + intArrayList);

        Integer[] intArray = new Integer[intArrayList.size()];
        intArray = intArrayList.toArray(intArray);
        int sum = 0;
        for (int i : intArray) {
            sum = sum + 1;
        }
        System.out.println("sum of intArray = " + sum);

    }
}
