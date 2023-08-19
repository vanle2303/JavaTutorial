package tutorials.tutorial04_arrays_functions;

/**
 * this class is to sort an array in order
 * however, when we swap a[i] with a[j], we somehow lose the initial value of a[j]
 * therefore, we create a new and separate function called swapPosition to swap the two values
 * but dont change or lose any initial values
 * when we're working with sortArray func, we just need to call swapPosition
 */
public class SortArrayInOrder {
    public static void main(String[] args) {
        int[] a = {2,1,10,9,6,3};
        sortArray(a);
    }

    public static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++ ) {
                if (a[i] > a[j]) {
                    swapPosition(a, i, j);
                }
            }
        }
        ArrayUtility.print1DArray(a);
    }

    public static void swapPosition(int[]a, int i, int j) {
        int value = a[j];
        a[j] = a[i];
        a[i] = value;
    }
}
