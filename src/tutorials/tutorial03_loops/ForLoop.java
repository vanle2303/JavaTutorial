package tutorials.tutorial03_loops;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 15; i > 10; i--){
            System.out.println(i);
        }

        printEvenNumbers(20);

        printRotatingMatrix(5);

        printTriangleMatrix(9);
    }

    public static void printEvenNumbers(int n) {
        for (int i = 0; i <= n; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void printRotatingMatrix(int size) {
        for (int i = 1; i <= size; i++){
            int value = i;
            for (int j = 1; j <= size; j++){
                System.out.print("  " + value);
                if (value == size){
                    value = 1;
                } else{
                    value++;
                }
            }
            System.out.println();
        }

    }

    public static void printTriangleMatrix(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i); j++){
                System.out.print("  ");
            }
            for (int k = 1; k<= i; k++){
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}


