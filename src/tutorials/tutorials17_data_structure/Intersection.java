package tutorials.tutorials17_data_structure;

import java.util.*;

/**
 * This class demos an example of getting the intersection of 2 given lists
 * There are 2 sub-examples in this class:
 *      1. Given 2 lists with unique elements and require to return a list of intersection
 *          eg: (1,2,4) & (1,3,5,6) => expect to get (1)
 *      2. Given 2 lists with duplicated elements and require to return a list of intersection
 *          eg: (1,1,2,4) & (1,1,1,2,3,5,6)  => expect to get (1,1,2)
 */

public class Intersection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(4);

        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(6);

        //System.out.println(getIntersections(list1, list2));

        HashMap<Integer,Integer> intersectionMap = getIntersectionMap(list1,list2);
        System.out.println(intersectionMap);
        System.out.println(getIntersectionList(intersectionMap));

    }

    /**
     * This is the first sub-example that is given 2 lists with unique elements and require to return a list of intersection
     * This approach contains 2 methods with the complexity of O(n^2)
     *      1. isIn(): to check if the int number is in the list or not
     *      2. getIntersections(): make use of isIn() to get the expected list of intersection
     *         a, Loop through all the elements of list2
     *         b, If the element is in list1, add that element to the result list
     */
    public static List<Integer> getIntersections(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            int num = list2.get(i);
            if (isIn(num, list1)) {
                result.add(num);
            }
        }
        return result;
    }

    /**
     * This method is to check if the int number is in the list or not
     * @param num
     * @param list
     * @return
     */
    public static boolean isIn(int num, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (num == list.get(i)) {
                return true;
            }
        }
        return false;
    }


    /**
     * This is the second sub-example that given 2 lists with duplicated elements and expect to return a list of intersection
     * This approach contains 3 steps:
     *      1. getFrequencyMap(): return a map of the int num  with the number of its appearance in the list
     *      2. getIntersectionMap() : return a intersection map from 2 frequency maps receiving from previous method
     *      3. getIntersectionList() : get the final result
     */

    /**
     * 3rd step: get the intersection list
     * From the intersection map, add the key into the result list as many times as the key's value is
     */
    public static List<Integer> getIntersectionList(HashMap<Integer, Integer> intersectionMap) {
        List<Integer> intersectionList = new ArrayList<>();
        Set<Integer> keysSet = intersectionMap.keySet();
        for (int key : keysSet) {
            for (int i = 0; i < intersectionMap.get(key); i++) {
                intersectionList.add(key);
            }
        }
        return intersectionList;
    }

    /**
     * 2nd step: to get an intersection map from 2 frequency maps
     * Main algorithm:
     *      If frequencyMap2 contains the key from frequencyMap1, add that key into the result map with the inserted
     *      value is the smaller value of that key (compare 2 values of that key from 2 frequency maps)
     *
     */
    public static HashMap<Integer, Integer> getIntersectionMap(List<Integer> list1, List<Integer> list2) {
        HashMap<Integer, Integer> intersectionMap = new HashMap<>();
        HashMap<Integer, Integer> frequencyMap1 = getFrequencyMap(list1);
        HashMap<Integer, Integer> frequencyMap2 = getFrequencyMap(list2);
        Set<Integer> intKeysSet1 = frequencyMap1.keySet();

        for (int num : intKeysSet1) {
            if (frequencyMap2.containsKey(num)) {
                if (frequencyMap1.get(num) >= frequencyMap2.get(num)) {
                    intersectionMap.put(num, frequencyMap2.get(num));
                } else {
                    intersectionMap.put(num, frequencyMap1.get(num));
                }
            }
        }
        return intersectionMap;
    }

    /**
     * 1st step: to get a frequency map from a given list
     */
    public static HashMap<Integer, Integer> getFrequencyMap(List<Integer> list) {
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num)+1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        return frequencyMap;
    }
}
