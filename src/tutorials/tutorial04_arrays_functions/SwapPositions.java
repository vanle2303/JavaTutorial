package tutorials.tutorial04_arrays_functions;

public class SwapPositions {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        //ArrayUtility.print1DArray(swapFirstLast(a));
        //System.out.println();
        //ArrayUtility.print1DArray(swapSortInOrder(a));\

        ArrayUtility.print1DArray(a);
        swapFirstLast(a);
        System.out.println();
        ArrayUtility.print1DArray(a);

        System.out.println();
        int[] b = {1};

        try {
            ArrayUtility.print1DArray(shiftToTheRight(b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /** 1
     * switch position of the first and the last elements of an array.
     * for example: from {1,2,3,4,5} to {5,2,3,4,1}
     */
    public static void swapFirstLast(int[] a) {
        int value = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = value;

    }

    /** 2
     * swap positions of all the elements of an array and reverse array
     * for example: from {1,2,3,4,5} to {5,4,3,2,1}
     */
    public static int[] reverseArray(int[] a) {
        int[] newArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[a.length-1-i];
        }
        return newArray;
    }

    /**
     * creating a new array and shift all elements to the right
     */
    public static int[] shiftToTheRight(int[] a) throws Exception {
        if (a.length == 0) {
            throw new Exception("*Error*");
        }
        int firstValue = a[a.length-1];
        int[] shiftedArray = new int[a.length];
        shiftedArray[0] = firstValue;
        for (int i = 1; i < a.length; i++) {
            shiftedArray[i] = a[i-1];
        }
        return shiftedArray;
    }


}
