package tutorials.tutorials15_collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * This class demos an example of printing out a String set of unique characters from an input String
 * using applications of Set
 */

public class UniqueCharsInStringUsingSet {
    public static void main(String[] args) {
        String inputString = "abacdbe";

        //This is for non-static method
        /*PrintStringMembers testString = new PrintStringMembers();
        System.out.println(testString.getUniqueChar(inputString));*/

        //This is for static methods
        getUniqueChar(inputString);
        System.out.println(getStringFromHashSet(getUniqueChar(inputString)));

        System.out.println("For");
        System.out.println("Final result: " + getUniqueCharsUsingFor(inputString));

    }

    /**
     * We decide to break our work into small parts in order to make it easier to think and solve the
     * prob. Here we have 2 methods supporting each other: getUniqueChar() and getStringFromHashSet().
     * We operate getUniqueChar() first to get all the characters needed in the input string.
     * We then transform those chars into a string, which is our goal of this prog and return it.
     *
     * Because we want to preserve the insertion order, we use class LinkedHashSet in stead of HashSet,
     * LinkedHashSet is a subclass of HashSet but it also has the features of linkedList: keep the
     * order of inserting elements into the set.
     * In other words, the difference between HashSet and LinkedHashSet is that LinkedHashSet has a
     * doubly-linked list running through all of its entries
     * @param string
     * @return
     */
    public static LinkedHashSet<Character> getUniqueChar(String string) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            uniqueChars.add(string.charAt(i));
        }
        return uniqueChars;

    }

    /**
     * After getting a set of characters using the preceding code, we wanna turn them into a String.
     * And here is how we do it.
     * We're using the most powerful feature of Collection: iteration
     * In order to use iterator() effectively (without any possibility of exception), we first use
     * method hasNext() to check if the set still has elements or not.
     * If yes, we'll get that character by calling method next()
     * To do this, we need a object of class Iterator since those 2 methods belong to this class.
     * More details in the piece of code below
     * @param charSet
     * @return
     */
    public static String getStringFromHashSet(LinkedHashSet<Character> charSet) {
        String outputString = "";
        Iterator<Character> iterator = charSet.iterator();
        while (iterator.hasNext()) {
           char c = iterator.next();
           outputString = outputString + c;
        }
        return outputString;
    }

    /**
     * This is another way to get unique chars by using 2 for loops.
     * Here, recall the use of break; and continue;. These two are often used when we're working with
     * a list/collection
     *    1. break; is that we exit the nearest for loop and execute the next statement after for loop.
     *      eg. Test a list if it contains all even numbers, if there's an odd, break;, we'll exit
     *      the test/list (we totally move out of the list)
     *    2. continue; is we exit the being tested element and move to test the next element of
     *      the testing list (move to the next element NOT move out the list)
     *      eg. Test the quality of applications of college students. First, test the gpa,
     *      if good, move to the next criteria (activity, finance,etc.);
     *      if not good, continue;, means eliminate this student and move to the next application
     * @param string
     * @return
     */

    public static String getUniqueCharsUsingFor(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            boolean isIn = false;
            for (int j = 0; j < result.length(); j++) {
                if (string.charAt(i) == result.charAt(j)) {
                    isIn = true;
                    break;
                }
            }

            //boolean variables: NO need to write isIn == true/false
            //Since it's boolean, we can just write (isIn), that's enough
            if (isIn) {
                continue;
            }
            result.append(string.charAt(i));
        }
        return result.toString();
    }
}
