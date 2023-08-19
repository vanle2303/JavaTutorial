package tutorials.tutorials06_classes.classes03_overload.overload02_type_promotion;

/**
 * In this class, we demo the type promotion via params.
 * In one of method "test" below, we take a param of type double. However, when we call it, we pass an int to it.
 * Java will automatically promote it to double to make it compatible to the type of param a
 */
public class PromoteTypes {
    int test() {
        return 0;
    }
    int test(int a, int b) {
        return a*b;
    }
    double test(double a) {
        return a*a;
    }

    public static void main(String[] args) {
        PromoteTypes obj = new PromoteTypes();
        int i = 3;

        System.out.println(obj.test());
        System.out.println(obj.test(10,20));
        //here, we pass an int to "test", but it still works thanks to type promotion mentioned in the class cmt
        System.out.println("Result for double a test: " + obj.test(i)); //this will evoke test double
    }
}
