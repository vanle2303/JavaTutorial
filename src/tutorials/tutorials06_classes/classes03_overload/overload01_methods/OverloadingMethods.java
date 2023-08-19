package tutorials.tutorials06_classes.classes03_overload.overload01_methods;

/**
 * demonstrate overloading method,
 * overloading method is to define methods within the same class that share the same name.
 * It is legal as long as the methods have different parma lists
 * When u call an overloaded method, Java uses the param list to determine
 * which overloaded method is actually called
 */

public class OverloadingMethods {
    /**
     * There are 3 methods test below, but they take different param lists
     */
    void test() {
        System.out.println("No parameters");
    }
    void test(int a) {
        System.out.println("a: " + a);
    }
    void test(int a, int b) {
        System.out.println("a and b:" + a + " ," + b);
    }
    double test(double a) {
        //System.out.println("Double a: " + a);
        return a*a;
    }

    public static void main(String[] args) {
        OverloadingMethods obj = new OverloadingMethods();
        double result;
        obj.test();
        obj.test(10);
        obj.test(10,20);
        obj.test(30.123);
        System.out.println("result of double test " + obj.test(30.123));
    }

}
