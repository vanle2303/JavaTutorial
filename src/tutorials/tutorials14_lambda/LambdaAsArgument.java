package tutorials.tutorials14_lambda;

/**
 * This prog demos the concept of passing lambda expression as arguments.
 * There are multiple ways to use lambda expression: variable initialization, return statements, method arguments, etc.
 */

interface StringFunction {
    String func(String string);
}

public class LambdaAsArgument {
    static String stringOp(StringFunction strFunc, String str) {
        return strFunc.func(str);
    }

    public static void main(String[] args) {
        String inputStr = "Lambda adds power to Java";
        String outputStr;

        //Here, a lambda expression is treated as an argument and then passed to a method
        //This code is to uppercase a passed string
        outputStr = stringOp(str -> str.toUpperCase(), inputStr);
        System.out.println("The string in uppercase: " + outputStr);

        //Here, we use lambda expression as variable initialization
        //This passes a block of lambda to remove space
        outputStr = stringOp(str -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inputStr);
        System.out.println("The string with spaces removed: " + outputStr);

        //This reuses an instance created by an earlier lambda expression
        StringFunction reserve = string -> {
            String result = "";
            for (int i = string.length()-1; i >= 0; i--) {
                result += string.charAt(i);
                //This statement equals the following
                //result = result + string.charAt(i);
                //Note: a += 2; means a = a + 2;
            }
            return result;
        };
        System.out.println("The string reversed: " + stringOp(reserve, inputStr));
    }
}
