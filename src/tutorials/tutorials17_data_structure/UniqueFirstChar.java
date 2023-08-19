package tutorials.tutorials17_data_structure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class demos the example of getting the very first and non-repeated character of an input string
 * Eg. for "acbade", we expect to get `b`
 * There are 2 ways to approach this prob
 *      1. with Collection and Map:
 *          a, Reuse the method getFrequencyMap() to get the frequency map of a=3, b=2, c=1, d=1, for example
 *             But this time, instead of HashMap, we MUST use LinkedHashMap to retain the insertion order
 *          b, Inside method getFirstNonRepeatedCharWithCollection(): we go through all the pairs of the
 *             map, if the value of that pair equals 1, return the corresponding key.
 *             Since this is a LinkedHashMap, every insertion order is saved.
 *      2. traditional way:
 *          a, Reuse method getFrequency() to get how many times that the character is in the input string
 *          b, Use a for loop to loop over all the elements/chars of the input string
 *             If frequency != 1, continue; will move to test the next key
 *             If frequency = 1, return that char
 *
 *
 */

public class UniqueFirstChar {
    public static void main(String[] args) {
        String inputString = "acbade";
        System.out.println(getUniqueFirstChar(inputString));

        System.out.println(getFirstNonRepeatedCharWithCollection(inputString));
    }

    /**
     * This method takes advantage of getFrequencyMap() to return the very first and non-repeated char of a string
     * The main algorithm of this method is
     *      1. Assume that at this time we already get a Map of of the character with the number of its appearance
     *      2. We cycle through all the keys of the map by for-each loop, if the very first corresponding
     *      value is 1, the key of that value is what we're looking for
     *
     * @param inputString
     * @return
     */
    public static Character getFirstNonRepeatedCharWithCollection(String inputString) {
        //Here we initialize a Map by calling method getFrequencyMap()
        Map<Character, Integer> frequencyMap = getFrequencyMap(inputString);
        //Get a set of all the keys
        Set<Character> keysSet = frequencyMap.keySet();
        //for-each loop
        for (char c : keysSet) {
            if (frequencyMap.get(c) != 1) {
                continue;
            }
            return c;
        }
        return null;
    }

    /**
     * This method returns a Map (actually a LinkedHashMap) of the character with the number of its appearance
     * in the string
     *
     * The algorithm of this approach is that we check iF the result map already contains the char key or not.
     * If yes, we plus the frequency by 1 and then put that new frequency corresponding to the
     * already-existed key.
     * If no, we just simply put 1 as the frequency of that corresponding key
     * @param inputString
     * @return
     */
    public static Map<Character, Integer> getFrequencyMap(String inputString) {
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c)+1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        return frequencyMap;
    }

    /**
     * This method takes advantage of method getFrequency()
     * Algorithm: the very first char with a frequency 1 is the char that we're looking for
     * @param inputString
     * @return
     */
    public static Character getUniqueFirstChar(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            //get the frequency of the testing char
            if (getFrequency(c,inputString) != 1) {
                continue;
            }
                return c;
        }
        return null;
    }

    /**
     * This method is to get how many times that the character is in the input string
     * @param c
     * @param inputString
     * @return
     */
    public static int getFrequency(Character c, String inputString) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (c == inputString.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
