package tutorials.tutorial04_arrays_functions;

/**
 * the methods to print out 1D and 2D arrays
 */
public class ArrayUtility {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        print1DArray(a);
        System.out.println();

        System.out.println("Print 2D array");
        int[][] b = {
                {1, 2, 3},
                {4},
                {},
                {5, 6}
        };
        print2DArray(b);

    }

    public static void print1DArray(int[] a) {
        System.out.print("{");
        for (int i = 0; i < a.length; i++){
            if (0 <= i && i < (a.length-1)){
                System.out.print(a[i] + ",");
            }
            if (i == (a.length-1)){
                System.out.print(a[i]);
            }
        }
        System.out.print("}");
        //System.out.println();
    }

    public static void print2DArray(int [][] a) {
        System.out.println("{");
        for (int i = 0; i < a.length; i++) {
            if (i < (a.length-1)) {
                System.out.print(" ");
                print1DArray(a[i]);
                System.out.print(",");
                System.out.println();
            } else {
                System.out.print(" ");
                print1DArray(a[i]);
                System.out.println();
            }
        }
        System.out.println("}");
    }
}
