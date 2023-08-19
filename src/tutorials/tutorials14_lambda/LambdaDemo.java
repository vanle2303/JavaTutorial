package tutorials.tutorials14_lambda;

/**
 * This class demos the concept of lambda expression, which is an unnamed method.
 * Lambda expression is used to implicitly implement the methods defined by a functional interface.
 * A functional interface is an interface containing one and only one abstract method. Functional interface is sometimes
 * referred to as SAM type, which stands for Single Abstract Method.
 *
 * An example of lambda expression:
 *      myNumber = () -> 123.45;
 * this lambda is similar to the following method:
 *      double myMath() {
 *          return 123.45;
 *      }
 *
 */

/**
 * This is a functional interface, which is an interface with one and only one abstract method
 */
interface MyNumber {
    double getSum(double x, double y) throws MyException;
}

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        try {
            MyNumber myNumber1;
            myNumber1 = (a, b) -> a+b;
            System.out.println("A fixed value: " + myNumber1.getSum(1,2));

            myNumber1 = (x, y) -> Math.random() * 10;
            System.out.println("A random value: " + myNumber1.getSum(3,4));
            System.out.println("Another random value: " + myNumber1.getSum(5,6));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        //This is illegal because the type of abstract method and the lambda expression must be compatible
        //Here, myNumber requires to a return type of double, which is totally not compatible with type String
        //passed to it.
        //myNumber = () -> "123.45";

        MyNumber myNumberWithException = (x, y) -> {
            if (x < y) {
                //MyException e = new MyException("x < y");
                throw new MyException("x cannot be less than y.");
            }
            return x+y;
        };

        try {
            System.out.println(myNumberWithException.getSum(1,2));
        } catch (MyException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
