package tutorials.tutorials06_classes.classes14_prog_args;

/**
 * This class demos the use of program arguments
 * When we run a program, we can pass arguments to it, just like the way we pass arguments to a function
 * We pass arguments when we run the program in the Terminal
 * Any strings after the program name are considered as arguments and treated as strings
 *      1. We need to compile the program from Java code into binary code by using Java command
 *         cd: to the dir where the Java file Arg1PrintAllArguments.Java is located
 *         run: `javac Arg1PrintAllArguments.java`
 *         This will create a new file named Arg1PrintAllArguments.class
 *      2. To run this program, cd to the scr dir
 *          2.1. Run without arguments
 *              `java tutorials.tutorials06_classes.classes14_prog_args.Arg1PrintAllArguments`
 *          2.2. Run with arguments
 *              `java tutorials.tutorials06_classes.classes14_prog_args.Arg1PrintAllArguments hello 1 2 3`
 *              Here we provide 4 args and they are all treated as 4 strings
 *              See method main for how we receive these args in the program
 *
 *
 */
public class PrintAllArguments {

    /**
     * Method main is where we receive the program arguments from the command line in the Terminal
     * Param args is an array of strings storing all the arguments
     * Here, we just print them out by looping through the array
     * @param args
     */
    public static void main(String[] args) {
        //Print all the args of this prog
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
