package tutorials.tutorials14_lambda;

/**
 * This is another class that demos lambda expression.
 * This class is to test if a number is even or not.
 *
 * When using this program, for example
 *       NumericTest isEven = (n) -> n%2 == 0;
 * we notice that the type of n is not specified. But Java can infer its type from the parameter type of method test()
 * defined inside interface NumericTest. Therefore, n is implicitly inferred as int type.
 * But we can also explicitly specify the type of n when using it like the following
 *      NumericTest isEven = (int n) -> n%2 == 0;
 *
 * Note:
 *      1. A functional interface reference can be used to execute any lambda expression that is compatible with it
 *      2. When a lambda expression has only one param, it's also acceptable to not surround the param on the left side
 *      of the lambda operator with parenthesis
 *      e.g.    NumericTest isEven = n -> n%2 == 0;  // this is still legal
 *      3. The type of n can be specified or not. But be consistent especially in case of more than one params needed.
 *      Specifically, if there are more than one param needed for the lambda expression and you want to specify the
 *      type of them, you have to specify the types for all of them.
 *      For example: both of these are legal
 *              (n, d) -> (n % d) == 0
 *          or  (int n, int d) -> (n % d) == 0
 *      But this is totally ILLEGAL
 *              (int n, d) -> (n % d) == 0
 *      4. This is illegal because the type of abstract method and the lambda expression must be compatible
 *         Here, myNumber requires to a return type of double, which is totally not compatible with type String
 *         passed to it.
 *              myNumber = () -> "123.45";
 */

/**
 * This is a functional interface which contains only one abstract method
 */
interface NumericTest {
    boolean test(int n);
}

public class NumericTestDemo {
    public static void main(String[] args) {
        //This is a lambda expression to test if a number is even
        //Note that it is also possible to specify the type of n like the following
        //NumericTest isEven = (int n) -> n%2 == 0;
        NumericTest isEven = (n) -> n%2 == 0;

        if (isEven.test(1)) {
            System.out.println("1 is even");
        } else {
            System.out.println("1 is not even");
        }

        if (isEven.test(2)) {
            System.out.println("2 is even");
        } else {
            System.out.println("2 is not even");
        }

        //Now we use another lambda expression to test if a number is positive or not
        NumericTest isNonNegative = (n) -> n >= 0;

        if (isNonNegative.test(2)) {
            System.out.println("2 is non-negative");
        } else {
            System.out.println("2 is negative");
        }

        if (isNonNegative.test(-2)) {
            System.out.println("-2 is non-negative");
        } else {
            System.out.println("-2 is negative");
        }
    }
}
