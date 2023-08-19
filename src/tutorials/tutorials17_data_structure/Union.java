package tutorials.tutorials17_data_structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * This class demos an example of getting the union from two lists.
 * There are two sub-examples in this program
 *      1. Given 2 lists with unique elements and require to return a list of union
 *        eg: (1,2,4) & (1,3,5,6) => expect to get (1,2,4,3,5,6)
 *      2. Given 2 lists with duplicated elements and require to return a list of union with the max times of appearances
 *      in each list
 *        eg: (1,1,2,4) & (1,1,1,3,5,6)  => expect to get (1,1,1,2,3,4,5,6)
 */

public class Union {
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
        list2.add(3);
        list2.add(5);
        list2.add(6);

        //System.out.println(getUnion(list1,list2));

        HashMap<Integer, Integer> frequencyMap1 = getFrequencyMap(list1);
        System.out.println(frequencyMap1);
        HashMap<Integer, Integer> frequencyMap2 = getFrequencyMap(list2);
        System.out.println(frequencyMap2);
        HashMap<Integer, Integer> mapUnion = getMapUnion(frequencyMap1, frequencyMap2);
        System.out.println(mapUnion);
        System.out.println(getUnionWithDuplicatedElements(mapUnion));
    }

    /**
     * This is No1 sub-prob: return a list of union with unique elements
     * This contains 2 steps:
     *      1. isIn(): to check if that int number is in the list or not
     *      2. getUnion(): get the final expected result list
     */

    /**
     * Main algorithm:
     *      1. Loop through all the element of list2
     *         If that number is not in list1, add it to list1
     * @param list1
     * @param list2
     * @return
     */
    public static List<Integer> getUnion(List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            int num = list2.get(i);
            if (!isIn(num, list1)) {
                list1.add(num);
            }
        }
        return list1;
    }

    /**
     * This method is to check if a given num is in the list or not
     * @param value
     * @param list
     * @return
     */
    public static boolean isIn(int value, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (value == list.get(i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This is the No2 sub-prob: return a list of union with the max times of appearances in each list
     * 3 steps:
     *      1. getFrequencyMap(): return a map of the int num  with the number of its appearance in the list
     *      2. getMapUnion() : return a union map from 2 frequency maps receiving from previous method
     *      3. getUnionWithDuplicatedElements() : get the final result
     *
     */

    /**
     * This method is to get the expected union list.
     * We'll loop through all the keys of the union map and then add that key to the result map,
     * the number of times adding that key equals the value of the key in the union map
     * @param frequencyMap
     * @return
     */
    public static List<Integer> getUnionWithDuplicatedElements(HashMap<Integer,Integer> frequencyMap) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> intKeysSet = frequencyMap.keySet();
        for (int key : intKeysSet) {
            for (int i = 0; i < frequencyMap.get(key); i++) {
                result.add(key);
            }
        }

        return result;
    }

    /**
     * This method is to get a union map from 2 frequency maps getting from getFrequencyMap()
     * Main algorithm:
     *      1. Loop through all the key of frequency map 1
     *        If the key is not is map2, add that key and its value to the union map
     *        If the key is in map2, add that key and its max value (compare 2 value from 2 maps) to the union map
     *      2. Loop through all the keys of frequency map 2
     *        If the key is not in map1, add that key and its value into the union map
     *
     * We can also use either map1 or map2 as the final union map since method put will replace the old value if there's
     * already a value of that key in the map
     * @param frequencyMap1
     * @param frequencyMap2
     * @return
     */
    public static HashMap<Integer, Integer> getMapUnion(HashMap<Integer, Integer> frequencyMap1,
                                                        HashMap<Integer, Integer> frequencyMap2) {
        HashMap<Integer, Integer> unionMap = new HashMap<>();
        Set<Integer> intKeysSet1 = frequencyMap1.keySet();
        Set<Integer> intKeysSet2 = frequencyMap2.keySet();
        for (int num : intKeysSet1) {
            if (!frequencyMap2.containsKey(num)) {
                unionMap.put(num, frequencyMap1.get(num));
            } else {
                if (frequencyMap1.get(num) >= frequencyMap2.get(num)) {
                    unionMap.put(num, frequencyMap1.get(num));
                } else {
                    unionMap.put(num, frequencyMap2.get(num));
                }
            }
        }

        for (int num : intKeysSet2) {
            if (!frequencyMap1.containsKey(num)) {
                unionMap.put(num, frequencyMap2.get(num));
            }
        }
        return unionMap;
    }

    /**
     * This method is to get a frequency map of the int num  with the number of its appearance in the list
     * @param list
     * @return
     */
    public static HashMap<Integer, Integer> getFrequencyMap(List<Integer> list) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        return frequencyMap;
    }
}

