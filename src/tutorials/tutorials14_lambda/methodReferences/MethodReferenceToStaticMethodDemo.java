package tutorials.tutorials14_lambda.methodReferences;

/**
 * This class demos the use of method reference, which provides a way to refer to a method without executing it.
 * Method reference relates to lambda expression because it also requires a target-type context consisting of
 * a compatible functional interface.
 * When evaluated, a method reference also creates an instance of the functional interface.
 * There are different types of method reference
 *      1. method reference to static method:       ClassName::methodName
 *      2. method reference to instance methods:    objRef::methodName
 */

/**
 * We can say functional interface StringFunctions and reverseString are compatible since they both take String type
 * and return String type
 */
interface StringFunctions {
    String func(String string);
}

/**
 * This class is to reverse a string
 */
class MyStringOp {
     static String reverseString(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}

public class MethodReferenceToStaticMethodDemo {
    static String stringOps(StringFunctions stringFunc, String s) {
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        String inputStr = "lambda adds power to java";
        String outputStr;

        //Normally, we pass a lambda expression to a method call. But now we can also pass a method as an argument
        //to call a method. And here is how to do so with a static method
        outputStr = stringOps(MyStringOp::reverseString, inputStr);

        System.out.println("Original string: " + inputStr);
        System.out.println("Reversed string: " + outputStr);

        //If method reverseString() is non-static, we can call it by a class object like the following:
        /*MyStringOp testString = new MyStringOp();
        outputStr = stringOps(testString::reverseString, inputStr);*/
    }
}
