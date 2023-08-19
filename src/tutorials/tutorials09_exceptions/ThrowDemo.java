package tutorials.tutorials09_exceptions;

/**
 * This class demos the use of statement throw, which is to throw an exception into the program and then we have
 * to resolve it.
 * We use try-catch in the def process if the exception happens in this process. However, if an exception happens
 * during the calling process (eg. when passing args to params), we should use try-catch in the caller.
 */

class MyMath {
    /**
     * The first line shows `throws IllegalArgumentException`, which is to announce that this code may have
     * an exception of this type.
     * In `else` statement, we create an exception of type IllegalArgumentException and throw it into the program.
     * @param number
     * @return
     * @throws IllegalArgumentException
     */
    public static double sqrt(double number) throws IllegalArgumentException {
        if (number >= 0) {
            return Math.sqrt(number);
        } else {
            IllegalArgumentException e = new IllegalArgumentException("Number has to be non-negative.");
            throw e;
        }
    }
}

public class ThrowDemo {
    /**
     * Here, we're using try-catch in order to if there's an exception, catch it and resolve it for me
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.sqrt(-2));
        } catch (IllegalArgumentException e) {
            //Here is the resolving step
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}


