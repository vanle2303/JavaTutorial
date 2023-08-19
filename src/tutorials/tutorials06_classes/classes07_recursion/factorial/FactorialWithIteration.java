package tutorials.tutorials06_classes.classes07_recursion.factorial;

/**
 * This class demos several ways to compute the factorials of a given num
 */
public class FactorialWithIteration {
    public static void main(String[] args) {
        //In order to call factorialUsingFor method, we have to create an obj of class Factorials
        //First, bc this method is not static, we need an obj to access it
        FactorialWithIteration fact = new FactorialWithIteration();
        System.out.println(fact.factorialUsingFor(5));
        System.out.println(fact.factorialUsingWhile(5));
    }

    /**
     * This method computes the factorial of a given num using the for loop.
     * This is not recursive. It is actually called iterative (lap di lap lai)
     * @param n
     * @return
     */
    public long factorialUsingFor(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result*i;
        }
        return result;
    }

    /**
     * This method computes the factorial of a given num using the while loop
     * @param n
     * @return
     */
    public long factorialUsingWhile(long n) {
        long result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        return result;
    }
}
