package tutorials.tutorials06_classes.classes07_recursion.factorial;

/**
 * This class demos the use of recursion (DE QUY), which is to define sth in terms of itself.
 * Specifically, when we define func f, we call it within its body of defn
 *
 */
public class FactorialWithRecursion {
    public static void main(String[] args) {
        //in order to call method fact, we basically just call it since this method is static
        //However, if the method is not static, in order to call it, we need to create an obj
        //and use that obj to call the method
        System.out.println(fact(4));
    }

    /**
     * This func computes the factorial of a given number.
     * U can see that inside func fact, we also call fact itself
     * To understand why it's legal to do so, assume n = 10.
     * 1. n = 10, inside "fact", we execute 10*fact(9). Java will loop for func fact to run for fact(9)
     *    then Java will use function fact itself to run for fact(9)
     * 2. n = 9, similarly, we get 9*fact(8)
     * 3. ...
     * ...
     * 10. n = 1, here inside func fact, the stopping condition (n==1) is satisfied, therefore, the func simply
     * returns 1
     *     The result is basically the multiplication of all the returned values
     * @param n
     * @return
     */
    public static long fact(long n) {
        if (n == 1) {
            return 1;
        }
        //we do not need else here bc of the return statement above.
        //In other words, if n = 1, then the func simply exits at the line return 1.
        return n* fact(n-1);
    }

}
