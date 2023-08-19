package tutorials.tutorial04_arrays_functions;

/**
 * this is pretty much the same as MinMax1DArray
 * Note new thing: throws Exception thingy
 * in main, use try and catch
 * try is to execute the method, and it will come to catch if the method has any exceptions
 * catch is to catch the error.
 * e.getMessage() is to print out the message about the exceptions that we set in the method
 */
public class MinMax2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 10},
                {4, 5, 6},
                {7, 8}
        };
        int[][] b = {};

        try {
            System.out.println("Min: " + getMin(a));
            System.out.println("Max: " + getMax(a));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static int getMin(int[][] a) throws Exception {
        if (a.length == 0) {
            throw new Exception("The array cannot be empty");
        }
        int min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (min > a[i][j]) {
                    min = a[i][j];
                }
            }
        }
        return min;
    }

    public static int getMax(int [][] a) throws Exception {
        if (a.length == 0) {
            throw new Exception("The array cannot be empty");
        }
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
