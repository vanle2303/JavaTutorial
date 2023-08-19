package tutorials.tutorials12_io;

/**
 * This class demos the use of assert keyword, which is a condition that should always be true when executing the
 * program.
 * assert has 2 forms:
 *      1. assert condition;
 *      2. assert condition : expr;
 * condition is always a boolean clause, if the condition is false --> the assertion fails
 * --> an exception is thrown, which is the expr clause.
 * eg:
 *      1. assert n > 0;
 *      --> This means the assertion will fail if n < 0. Basically, assert keyword will make sure that the prog
 *          will execute until n > 0.
 *      2. assert n > 0 : "n cannot be negative.";
 *      --> This means that when n > 0 is false (n < 0), an exception with the message "n cannot be negative."
 *          will be thrown.
 *
 * NOTE: assert keyword will not be automatically enabled during runtime. We have to activate it by this syntax
 *      java -ea filename
 *
 * For example, in order to run this program with the activated assertion, we need to go
 * Terminal -> out -> production -> JavaTutorial
 *      vanle@Vans-Air JavaTutorial % java -ea tutorials.tutorials12_io.AssertDemo
 */

public class AssertDemo {
    static int val = 3;

    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getNum();
            System.out.println(n > 0);
            assert n > 0 : "n cannot be negative.";
            System.out.println("n = " + n);

            /*n = getNum();
            if (n > 0) {
                System.out.println(n);
            }*/
        }
    }
}
