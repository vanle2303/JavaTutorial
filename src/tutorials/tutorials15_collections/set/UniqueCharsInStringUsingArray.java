package tutorials.tutorials15_collections.set;

/**
 * This class demos an example of printing a String set of unique characters from an input String
 * using the applications of array
 */

public class UniqueCharsInStringUsingArray {
    public static void main(String[] args) {
        String input = "cdabead";
        System.out.println(getUniqueChars(input));
    }

    /**
     * We also break our code into different parts in order to easily design and write the code
     * After method isNotIn() is done, it's a lot easier to work on this prob
     * Here we take advantage of class StringBuilder, which is a mutable sequence of characters.
     * Finally, we get the goal of this prob by turning that sequence of chars into a string
     * @param inputString
     * @return
     */

    public static String getUniqueChars(String inputString) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (isNotIn(inputString.charAt(i), builder)) {
                //method append() is to add a character in the end of the sequence
                builder = builder.append(inputString.charAt(i));
            }
        }
        //method toString() is to turn a sequence of chars into a string
        return builder.toString();
    }

    /**
     * This method is to check if a character of an input string is already in the output string or not
     * @param c
     * @param builder
     * @return
     */
    public static boolean isNotIn(char c, StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++){
            if (c == builder.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
