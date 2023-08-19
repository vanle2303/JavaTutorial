package tutorials.tutorial04_arrays_functions;

public class Convert2DTo1DArray {
    public static void main(String[] args) {

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

    /**
     *save the length of the new array
     */
    public static int length(int[][]a) {
        int length = 0;
        for (int i = 0; i < a.length; i++) {
            length = length + a[i].length;
        }
        return length;
    }
}
