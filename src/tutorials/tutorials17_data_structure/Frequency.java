package tutorials.tutorials17_data_structure;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * This class demos an example of getting the frequency of a character of a string
 * Eg: "abcabade" -> expect to return: a=3, b=2, c=1, d=1...
 *
 * There are two ways to solve this prob as below:
 *      1. one with method getFrequency() and frequencyMap() is very costly with the complexity of O(n^2)
 *         since we have to do the same amount of work with n elements of the first method and
 *         then n elements of the second one.
 *      2. However, the use method getFrequencyMap() is way less costly than the previous way
 *      with the complexity of just O(n). And it also takes advantage of the features of Collection and Map
 *      (data structures)
 *
 */

public class Frequency {
    public static void main(String[] args) {
        String inputString = "abcabade";
        //System.out.println(frequencyMap(inputString));
        System.out.println(getFrequencyMap(inputString));
    }

    /**
     * This is a cheap way to approach this prob. The brief idea of this approach is that we check if
     * the result map already contains the char key or not.
     * If yes, we plus the frequency by 1 and then put that new frequency corresponding to the
     * already-existed key.
     * If no, we just simply put 1 as the frequency of that corresponding key
     * @param inputString
     * @return
     */
    public static HashMap<Character, Integer> getFrequencyMap(String inputString) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            //This step is to check if that character already exists in the result map or not
            if (frequencyMap.containsKey(c)) {
                //If it already exists, we plus the frequency by 1 and then put that new frequency corresponding
                //to the already-existed key.
                frequencyMap.put(c, frequencyMap.get(c)+1);
            } else {
                //if it doesn't exist in the result map
                frequencyMap.put(c, 1);
            }
        }
        return frequencyMap;
    }

    /**
     * This approach consists of 2 different methods:
     *      1. getFrequency(): to get how many times that the character is in the input string
     *      2. frequencyMap(): to return the expected/result map
     * @param inputString
     * @return
     */

    public static HashMap<Character, Integer> frequencyMap(String inputString) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        //Use for loop to loop over all the elements/chars of the input string
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            //If that char already exists inside the result map, continue;(to move to the next value of i)
            if (frequencyMap.containsKey(c)) {
                continue;
            }
            //If that char is not already in the result map, put it into the map with the key is that char
            //and the value is received by calling method getFrequency();
            frequencyMap.put(c, getFrequency(c, inputString));
        }
        return frequencyMap;
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


