package tutorials.tutorials15_collections.set;

import tutorials.tutorial04_arrays_functions.ArrayUtility;

import java.util.HashSet;

/**
 * HashSet, a generic class, creates a collection using hash table for storage.
 * The underlying construct of HashSet is simply an array. This array uses element's hashcode to be
 * the index of that element in the array.
 * Each element has its own hashcode, it should normally be the address of that element in memory space.
 */

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> intHashSet = new HashSet<>();

        System.out.println(intHashSet.add(1));
        intHashSet.add(3);
        intHashSet.add(5);
        intHashSet.add(4);
        intHashSet.add(2);
        System.out.println(intHashSet.add(1));

        System.out.println(intHashSet.size());
        System.out.println(intHashSet);
        System.out.println(intHashSet.isEmpty());
        intHashSet.clear();
        System.out.println("Content of intHashSet: " + intHashSet);
        System.out.println(intHashSet.isEmpty());

    }
}
