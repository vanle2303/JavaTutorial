package tutorials.tutorial04_arrays_functions;

public class MinMax1DArray {
    public static void main(String[] args) {
        int[] a = {};
        try {
            System.out.println("Min: " + getMinValue(a));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Max: " + getMaxValue(a));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    /**
     * get min value of an array
     * choose the first value of the array as a tester, we then compare that value with others
     * in the array. the same thing was done to find the max value
     * @param a
     * @return
     * @throws Exception
     */

    public static int getMinValue(int[] a) throws Exception {
        if (a.length == 0) {
            throw new Exception("The array cannot be empty");
        }
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (min > a[i]){
                min = a[i];
            }
        }
        return min;
    }

    public static int getMaxValue(int[] a) throws Exception {
        if (a.length == 0) {
            throw new Exception("The array cannot be empty");
        }
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
