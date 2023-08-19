package tutorials.tutorial02_control;

public class IfAndFor {
    public static void main(String[] args) {
        printNumber(10);
    }

    public static void printNumber(int n){
        for (int i = 1; i <= n; i++){
            if (i==1){
                System.out.println("one");
            } else if (i==2) {
                System.out.println("two");
            } else if (i==3) {
                System.out.println("three");
            } else if (i==4) {
                System.out.println("four");
            } else {
                System.out.println("unknown");
            }
        }
    }
}
