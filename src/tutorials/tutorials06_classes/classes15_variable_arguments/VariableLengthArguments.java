package tutorials.tutorials06_classes.classes15_variable_arguments;

/**
 * This class demos the use of method params/ arguments whose length varies
 * We use arguments of variable length to simplify the way we call a function
 * and the way we pass arguments to it. This is mainly related to syntax for calling a function.
 *
 * For example here is how we declare it
 *      static void test(int ... v) {}
 * and here is how we call it
 *      test(1,2,3);
 *      test(1,2);
 *      test();
 *
 * Note 1: A method can have more than one param, including normal params (int, double, ...) and one vararg.
 *         But the vararg must be the last one being declared. For example:
 *              int test(int i, double j, int ... vals) {}
 *         Here the first 2 args passed to method test are matched to the first 2 params i and j.
 *         And the remaining arguments are assumed to belong to int...vals
 * Note 2: There must be only one vararg param in one declaration
 */
public class VariableLengthArguments {
    public static void main(String[] args) {
        //Here, we have to manually create a new array and then pass it in the old way to the func
        int[] array = {1,2,3};
        int oldSum = sumTheOldWay(array);
        System.out.println(oldSum);

        //Here, we dont have to manually create a new array
        //We simply pass as many args as we want
        int newSum = sumTheNewWay(1,2,3);
        System.out.println(newSum);
    }

    /**
     * This is the legacy(old) way to pack arguments of variable length in an array
     * And then pass the array to a method
     * Each time, we call this method, we have to manually create a new array and then pass it to the method
     * @param args
     * @return
     */
    public static int sumTheOldWay(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        return sum;
    }

    /**
     * This is the new way to pass arguments of variable length to a method
     * Now, each time we call this function, we can pass as many arguments as we want, separated by coma ,
     * Inside the func defn, args is treated as an array.
     * @param args
     * @return
     */
    public static int sumTheNewWay(int ... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) { // as u can see, args is treated as an array
            sum = sum + args[i];
        }
        return sum;
    }
}
