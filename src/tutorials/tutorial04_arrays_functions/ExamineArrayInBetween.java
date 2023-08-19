package tutorials.tutorial04_arrays_functions;

public class ExamineArrayInBetween {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.println(countInBetween(arr,5,10));

        int[] examinedArray = getNumbers(arr,5,10);
        ArrayUtility.print1DArray(examinedArray);
    }

    public static int countInBetween(int[] arr, int lowerBound, int upperBound) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (lowerBound < arr[i] && arr[i] < upperBound) {
                count++;
            }
        }
        return count;
    }

    public static int[] getNumbers(int[] a, int lowerBound, int upperBound) {
        int length = countInBetween(a, lowerBound, upperBound);
        int[] j = new int[length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (lowerBound < a[i] && a[i] < upperBound) {
                j[count] = a[i];
                count++;
            }
        }
        return j;
    }
}
