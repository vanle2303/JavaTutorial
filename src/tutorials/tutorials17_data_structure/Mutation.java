package tutorials.tutorials17_data_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class demos an example of checking if two input strings mutate or not. E.g "abc" and "cba" are 2 mutations
 * We can divide the prob into small parts in order to easily approach it:
 *      1. getFrequencyMap(): return a set that shows how many times that character appears the input string
 *      2. Compare the elements of the 2 result frequency maps. This step contains 2 sub-steps:
 *          a, equalMaps(): to test if two frequency maps are equal or not
 *          b, areMutation(): make use of equalMaps(), and then test if the two input strings are mutations or not
 *
 */

public class Mutation {
    public static void main(String[] args) {
        String str1 = "abca";
        String str2 = "acbb";

        System.out.println(areMutation(str1, str2));

    }

    /**
     * This method is the final step (the 3rd one) to check if two input strings are mutations or not
     * @param str1
     * @param str2
     * @return
     */
    public static boolean areMutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        //These statements call method equalMaps()
        Map<Character, Integer> frequencyMap1 = getFrequencyMap(str1);
        Map<Character, Integer> frequencyMap2 = getFrequencyMap(str2);
        return equalMaps(frequencyMap1,frequencyMap2);
    }

    /**
     * This is the second step to check if 2 frequency maps are equal or not
     * @param frequencyMap1
     * @param frequencyMap2
     * @return
     */
    public static boolean equalMaps(Map<Character, Integer> frequencyMap1,
                                    Map<Character, Integer> frequencyMap2) {
        if (frequencyMap1.size() != frequencyMap2.size()) {
            return false;
        }
        //Get a set-view of frequency map
        Set<Character> keysSet1 = frequencyMap1.keySet();
        for (char c : keysSet1) {
            if (!frequencyMap2.containsKey(c)) {
                return  false;
            }
            if (!frequencyMap1.get(c).equals(frequencyMap2.get(c))) {
                return false;
            }
        }
        return true;
    }

    /**
     * This is a very first step to return a set that shows how many times that character appears the input string
     * @param inputString
     * @return
     */
    public static Map<Character, Integer> getFrequencyMap(String inputString) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
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

}
