package tutorials.tutorial04_arrays_functions;

/**
 * given a 2D array, combine it into a 1D array and then sort in order
 * first, convert 2D to 1D array, and then sort them in order.
 * in order to convert to 1D, we need to know the length of the new 1D array
 * that's how length method works
 */
public class Sort2DArrayInOrder {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {0, 4},
                {5, 6, 7, 8}
        };

        //ArrayUtility.print1DArray(convertTo1DArray(a));
        //System.out.println();
        int[] b = convertTo1DArray(a);
        ArrayUtility.print1DArray(b);
        sortArray(b);
        ArrayUtility.print1DArray(b);
    }

    /**
     *sort the array in order
     */
    public static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++ ) {
                if (a[i] > a[j]) {
                    swapPosition(a, i, j);
                }
            }
        }
    }

    public static void swapPosition(int[]a, int i, int j) {
        int value = a[j];
        a[j] = a[i];
        a[i] = value;
    }


    /**
     *convert 2D array to 1D array
     */
    public static int[] convertTo1DArray(int[][]a) {
        int[] result = new int[length(a)];
        int count = 0;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++){
               result[count] = a[row][col];
               count++;
            }
        }
        return result;
    }

    public static int length(int[][]a) {
        int length = 0;
        for (int i = 0; i < a.length; i++) {
            length = length + a[i].length;
        }
        return length;
    }
}
