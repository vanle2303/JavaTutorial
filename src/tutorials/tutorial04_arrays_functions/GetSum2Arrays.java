package tutorials.tutorial04_arrays_functions;

/**
 * get sum of two 1D arrays
 * if the lengths of 2 arrays are different, return empty. otherwise, return the sum array
 */
public class GetSum2Arrays {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};

        ArrayUtility.print1DArray(a1);
        System.out.println();
        ArrayUtility.print1DArray(a2);
        System.out.println();
        ArrayUtility.print1DArray(getSumOf2Arrays(a1,a2));
    }

    public static int[] getSumOf2Arrays(int[] a1, int[] a2) {
        int[] emptyArray = {};
        int[] sum = new int[a1.length];
        if (a1.length != a2.length) {
            return emptyArray;
        }
        for (int i = 0; i < a1.length; i++){
            sum[i] = a1[i] + a2[i];
        }
        return sum;
    }
}


