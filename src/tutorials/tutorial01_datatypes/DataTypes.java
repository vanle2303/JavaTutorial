package tutorials.tutorial01_datatypes;

/**
 * this class basically lists all the Java primitive types and some short info abt each type
 */
public class DataTypes {
    public static void main(String[] args) {

        /**
         *  byte 8bits, width (-128,127)
         */
        byte bb = 1;
        System.out.println(bb);

        /**
         * short 16bits, width (-32k, 32k)
         */
        short s = 32000;
        System.out.println(s);

        /**
         * int 32bits, width (-2mil, 2mil)
         */
        int i = 2;
        i = i + 1;
        System.out.println(i);

        /**
         * long 64bits
         */
        long l = 30;
        System.out.println(l);

        /**
         * floating-point: float 32bits - single precision (fraction);
         *                 double 64bits - double precision (high-speed math)
         */
        double pi, r, a;
        r = 10;
        pi = 3.14;
        a = pi * r * r;
        System.out.println("The area is " + a);

        //char
        char ch1 = 88; //code for 'X'
        char ch2 = 89;
        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + ";" + ch2);

        char ch3 = 'X';
        System.out.println(ch3);
        ch3 = (char) (ch3 + 1);
        System.out.println(ch3);

        /**
         * boolean 1bit - true/false
         */
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);










    }
}
