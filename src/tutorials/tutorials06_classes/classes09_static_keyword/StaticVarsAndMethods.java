package tutorials.tutorials06_classes.classes09_static_keyword;

/**
 * This class demos the use of static keyword.
 * static can be put in front of an instance var or a method and that means the instance var or the
 * method will exist even before any obj of the class is created.
 * All instances of the class shares the same static variable
 * Therefore, u dont access static fields through obj; instead u access them through the class name.
 * This program demonstrates static variables, methods and blocks
 */
class StaticVarsAndMethods {
    static int a = 3;
    static int b;

    static void method(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    //This is a static block
    //It is executed even we dont call this block anywhere in the main method
    //In fact, there's no way to call a static block. It is often used to initialize some other static data
    //such as a clock
    static {
        System.out.println("static block initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        //as soon as class UseStatic is loaded, Java will scan for all static vars, methods and code blocks.
        //This static vars and methods are loaded into the memory and are ready to be called
        //before any objects are created.
        //On the other hand, all the static code blocks at the class level are executed right away
        //first, a is set to 3, then Java will find static block to execute.
        //That's the reason why "static block initialized" is printed out first
        //and then initializes b to a*4
        //Finally, in main method, method "method" is called, which passes 10 to x
        //then prints out all the values of x, a and b, where b is already initialized to a*4 in static block

        method(10);
    }
}

/**
 * we use classname.method() or classname.staticVar to access the fields of that class,
 * instead of accessing through a class object
 *
 */

class StaticDemo {
    //static int a = 3;
   // static int b = 6;

    //static

    public static void main(String[] args) {
        System.out.println(StaticVarsAndMethods.b);
    }
}
