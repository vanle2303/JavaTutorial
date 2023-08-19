package tutorials.tutorials09_exceptions;

/**
 * This class demos the syntax of "try" and "catch", which is that try this piece of code, and
 * if there's an exception, catch it and then resolve it for me.
 * If an exception is resolved by try and catch, there're no more exceptions in the program.
 */

class RandomOperations {
    public static double divideAndSum(double n, double m, int[] array) {
        try {
            int sum = 0;
            /*for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }*/
            sum = array[0] + array[1] + array[2] + array[3];
            return sum + n/m;
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            //This is for demo only. All exceptions should be passed back/ cascaded back to the callers
            return 0;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("ArrayIndexOutOfBoundsException");
            } else {
                System.out.println("NullPointerException");
            }
            return n/m;
        } catch (Exception e) {
            System.out.println("There're some errors.");
            e.printStackTrace();
            return 0;
        }
    }
}

public class TryCatchDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        //Since method divideAndSum is static, we have to use the class name to call this method, not an obj of the class
        System.out.println(RandomOperations.divideAndSum(1,2, array));
        System.out.println("============================");
        System.out.println(RandomOperations.divideAndSum(3,4, array));
        System.out.println("============================");

        System.out.println(RandomOperations.divideAndSum(3,0,array));
        System.out.println("============================");

        System.out.println(RandomOperations.divideAndSum(1,2,null));



    }
}
