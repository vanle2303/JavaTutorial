package tutorials.tutorials14_lambda;

/**
 * This class demos the concept of block lambda expressions. We've been working with a single lambda expression.
 * But now, we can use a block of lambda expressions, which contains multiple statements.
 * Note that when we use block lambda expressions, we must explicitly specify the return statement.
 */

interface NumericFunc {
    int func(int i);
}

interface StringFunc {
    String func(String string);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        //This demos a block of lambda that evaluates factorials
        NumericFunc factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println(factorial.func(3));
        System.out.println(factorial.func(1));

        //This demos a block of lambda that reverses the characters in a string
        StringFunc reverse = string -> {
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
