package tutorials.tutorial04_arrays_functions;

/**
 * get index sum
 * instead of using 2 arrays, we use rows and cols as the params of the method
 */
public class IndexSum {
    public static void main(String[] args) {
        ArrayUtility.print2DArray(getIndexSum(3,3));
    }

    public static int[][] getIndexSum(int rows, int cols) {
        int[][] newArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newArray[i][j] = i + j;
            }
        }
        return newArray;
    }
}
