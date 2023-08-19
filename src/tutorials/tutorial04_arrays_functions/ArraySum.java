package tutorials.tutorial04_arrays_functions;

/**
 * this computes the sum of an 1D array
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] a = {};
        System.out.println(getArraySum(a));
    }
    public static int getArraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }
}
