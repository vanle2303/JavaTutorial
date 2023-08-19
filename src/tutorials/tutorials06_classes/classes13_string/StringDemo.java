package tutorials.tutorials06_classes.classes13_string;

/**
 * This class demos the use of several ready-to-use String methods, including:
 *      1. equal()  : test if two (different) strings have the same value or not
 *      2. length() : to obtain the length of a string
 *      3. charAt() : to obtain the character at specified index within a string
 * We can also have arrays of strings. Here is how u declare a String array
 *      String string[] = new String[];
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "The first string";
        String str2 = "The second string";
        String str3 = str1;

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1 == str3); //true bc they both point to the same obj
        System.out.println(str1.equals(str3)); //true. If 2 objs are the same (==) then they are obviously equal (equal(...))
        System.out.println(str1.length()); //16
        //Get the char at index 4 (starting from 0)
        System.out.println("The char at index 4 of strObj1: " + str1.charAt(4)); //f

        //These 2 statements create 2 new strings using String constructor.
        //We pass the same string as arg to this constructor but Java would create 2 different objs in the memory
        //Therefore, these are 2 completely different objs
        String str4 = new String("hello");
        String str5 = new String("hello");
        System.out.println(str4 == str5); //false bc they point to 2 different objs in the memory space
        System.out.println(str4.equals(str5)); //true bc the method equals() only compare the values that the 2 objs hold

        //This is a String array
        String[] strArray = {"one", "two", "three"};

        //To get the length of an array, we use the property (instance var) .length
        //However, to get the length of a String object, we use method .length() of class String
        System.out.println(strArray.length); //3. Length is the number of the elements in an array
        //This demos String array and print out members of array string
        for (int i = 0; i < strArray.length; i++) {
            //Print out all the elements of array strArray
            System.out.println("strArray[" + i + "] :" + strArray[i]);
        }
    }
}
