package tutorials.tutorials11_autoboxing_autounboxing;

/**
 * This class demos auto-boxing and auto-unboxing.
 * Autoboxing is to encapsulate/box a primitive variable into an equivalent wrapper type
 * Auto-unboxing is to unbox a boxed object from its type wrapper
 */

public class Autoboxing {
    public static void main(String[] args) {
        //Normally, 100 is just an int number, but now 100 is boxed into an object and passed to an object
        //of type/class Integer
        Integer iob1 = 100; //autobox the value 100
        Integer iob2;
        int i;

        System.out.println("Print out the original value of iob1: " + iob1);

        //The following step will unbox 100 from an Integer object to an int value
        //after the increment is processed, the result is re-boxed back to ibj1
        ++iob1;
        System.out.println("After ++obj1: " + iob1);

        //Here, obj1 is unboxed, the expression is evaluated and the result is boxed again and then assigned to iob2
        iob2 = iob1 + iob1/3;
        System.out.println("The value of iob2 after expression: " + iob2);

        //The same expression is evaluated but the result is not re-boxed, it is simply passed to int i
        i = iob1 + iob1/3;
        System.out.println("The value of i after expression: " + i);
    }
}
