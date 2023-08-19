package tutorials.tutorial02_control;

public class SwitchAndFor {
    public static void main(String[] args) {
        translateNumberToString(5);
    }

    public static void translateNumberToString (int n){
        for (int i = 1; i <= n; i++){
            switch (i){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                default:
                    System.out.println("greater than 4");
            }
        }

    }
}
