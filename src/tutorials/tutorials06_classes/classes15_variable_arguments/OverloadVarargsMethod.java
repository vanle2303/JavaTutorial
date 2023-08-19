package tutorials.tutorials06_classes.classes15_variable_arguments;

/**
 * We can overload methods that take a variable-length argument by declaring methods share the same name
 * but have different params/ params type
 */
public class OverloadVarargsMethod {

    public static void main(String[] args) {
        overloadingVarargs(1,2,3);
        overloadingVarargs(true, true, false, true);
        overloadingVarargs("Test: ", 1,2,3);

    }
    static void overloadingVarargs(int ... v) {
        System.out.print("overloadingVarargs(int ... v): " + "Number of args: " + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void overloadingVarargs(boolean...v) {
        System.out.print("overloadingVarargs(boolean...v) " + "Number of args: " + v.length + " Contents: ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void overloadingVarargs(String text, int ... v) {
        System.out.print("overloadingVarargs(String text, int ... v) " + "Number of args: " + text + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
