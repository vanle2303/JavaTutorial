package tutorials.tutorials12_io;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * This class demos the use of static import and how to use methods when we already import/ do not import them into
 * our program.
 * We use static import at the beginning of a program like the following:
 *      import static java.lang.Math.sqrt;
 *      import static java.lang.Math.pow;
 *
 */

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println(getHypotenuseWithoutStaticImport(1,2));

        System.out.println(getHypotenuseWithStaticImport(3,4));
    }

    public static double getHypotenuseWithoutStaticImport(double side1, double side2) {
        double hypotenuse;
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypotenuse;
    }

    public static double getHypotenuseWithStaticImport(double side1, double side2) {
        double hypotenuse;
        hypotenuse = sqrt(pow(side1, 2) + pow(side2, 2));
        return hypotenuse;
    }
}


