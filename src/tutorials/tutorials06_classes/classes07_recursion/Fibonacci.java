package tutorials.tutorials06_classes.classes07_recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    /**
     * This function is also a recursive func
     * It computes the nth element of the Fibonacci series
     * @param n
     * @return
     */
    static int fibo(int n) {
        //This is the stopping condition. It is usually at the top of the func
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        //If the stopping condition is not met, then we recursively call this function
        // for smaller values (n-1) and (n-2)
        return fibo(n-1) + fibo(n-2);
    }
}
