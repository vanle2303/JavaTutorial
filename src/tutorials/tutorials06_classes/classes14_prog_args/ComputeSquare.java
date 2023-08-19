package tutorials.tutorials06_classes.classes14_prog_args;

/**
 * This class demos the real use of program's argument
 * Suppose I wirte a Java prog to compute the square of a number, each time I wanna run for a different number
 * I usually modify the code (the input or arg to the func) and run it again
 * So u can see that one has to be a Java programmer to do that
 * Now what if I give this program who doent know Java and want that person to run the program to compute
 * the sqaure for different numbers. Obviously, that person cannot do what I do
 * Therefore, Java provides a mechanism for users to run the program again with different inputs
 * and args is the way to do it.
 *
 * In this prog, we avoid hard-coding the input numbers to function getSquare. Instead, we capture the program
 * argument and programmatically pass it to the function getSquare. Therefore, a user can run a same program
 * with different inputs as follows
 *          `java tutorials.tutorials06_classes.classes14_prog_args.ArgumentDemo 3`
 *          `java tutorials.tutorials06_classes.classes14_prog_args.ArgumentDemo 6`
 *
 */
public class ComputeSquare {
    public static void main(String[] args) {
        //Here we assume that the program receive exactly one numeric arg (still treated as string by Java)
        if (args.length < 1) {
            System.out.println("You forgot to give a numeric argument to this program.");
            return;
        }
        String arg = args[0];

        //Since the param of method getSquare is int, we need to transfer String arg into a int value
        //In order to do so, we need to use a static method called "parseInt()" of class Integer as follows
        int input = Integer.parseInt(arg);

        //Here, we pass argument input into method getSquare and then assign it to a new variable int square
        int square = getSquare(input);
        System.out.println(square);
    }

    public static int getSquare(int number) {
        return number*number;
    }
}
