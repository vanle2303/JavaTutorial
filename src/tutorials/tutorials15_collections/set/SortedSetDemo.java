package tutorials.tutorials15_collections.set;

import java.util.*;

/**
 * SortedSet is an interface extending Set and it declares the behavior of a set sorted in ascending/increasing order.
 * In addition to those methods provided by Set, the SortedSet interface declares its own methods.
 * It is also generic interface with the following declaration:
 * 		interface SortedSet<E>
 */

public class SortedSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> intSortedSet = new TreeSet<>();

        System.out.println(intSortedSet.add(1));
        intSortedSet.add(4);
        intSortedSet.add(3);
        intSortedSet.add(5);
        intSortedSet.add(2);
        System.out.println(intSortedSet.add(1));

        System.out.println(intSortedSet);


    }
}
