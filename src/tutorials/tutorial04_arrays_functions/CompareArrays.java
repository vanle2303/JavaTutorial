package tutorials.tutorial04_arrays_functions;

/**
 * compare two different 1D arrays
 */
public class CompareArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2};

        System.out.println(compare(a,b));
    }

    public static boolean compare(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
