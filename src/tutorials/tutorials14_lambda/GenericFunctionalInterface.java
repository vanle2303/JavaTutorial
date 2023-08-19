package tutorials.tutorials14_lambda;

/**
 * This class demos a generic functional interface and lambda expressions
 * @param <T>
 */

interface Functions<T> {
    T func(T value);
}

public class GenericFunctionalInterface {
    public static void main(String[] args) {
        Functions<String> reverse = string -> {
            String result = "";
            for (int i = string.length()-1; i >= 0; i--) {
                result += string.charAt(i);
                //This statement equals the following
                //result = result + string.charAt(i);
                //Note: a += 2; means a = a + 2;
            }
            return result;
        };
        System.out.println(reverse.func("hello"));
        System.out.println(reverse.func("Van"));
    }
}

