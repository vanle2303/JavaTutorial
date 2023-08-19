package tutorials.tutorials15_collections.list;

/**
 * The List interface extends Collection and declares the behavior of a collection
 * that stores a sequence of elements. Elements can be inserted or accessed by
 * their position in the list, using a zero-based index. A list may contain duplicate
 * elements. List is a generic interface that has this declaration:
 *      interface List<E>
 *
 * This class also demos the use of method toArray(), which is converts a list into a real array for the purpose of
 * convenience.
 * For example, the method can be used like this:
 *      intArray = intArrayList.toArray(intArray);
 */

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList stringArrayList = new ArrayList<String>();
        System.out.println("Initial size of stringArrayList: " + stringArrayList.size());
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("E");
        stringArrayList.add(0, "FF");
        System.out.println("Size of stringArrayList after addition: " + stringArrayList.size());
        System.out.println("Content of stringArrayList: " + stringArrayList);

        stringArrayList.remove("E");
        stringArrayList.remove("2");
        System.out.println("Size of stringArrayList after deletion: " + stringArrayList.size());
        System.out.println("Final content of stringArrayList: " + stringArrayList);

        System.out.println(stringArrayList.contains("A"));
        System.out.println(stringArrayList.lastIndexOf(stringArrayList));
        System.out.println(stringArrayList.toArray());


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
