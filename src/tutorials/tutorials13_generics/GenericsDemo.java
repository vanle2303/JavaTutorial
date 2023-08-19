package tutorials.tutorials13_generics;

/**
 * This class demos the use of generics, which is basically to use a parameterized type(eg. T) when you declare a class
 * and let users decide which type of T is when they use the program.
 * The use of generics gives users the flexibility and specific restriction of type parameter.
 * It also provides the type-safety, which is the safety of object type especially in casting process.
 * Here is the syntax of generics:
 *      class class-name<parameterized type>{}
 * Parameterized type can be a letter T or whatever. T is a traditional use, there're two other common letters: V and E
 * @param <T>
 */

/**
 * class Generics used parameterized type T in declaration, which let users decide what T is when they use it.
 * T can be used as a placeholder for an actual type that will be passed when an object is created
 * T can be whatever class the users want. After declaration, we treat T as a real type, a real class.
 * @param <T>
 */
class Generics<T> {
    T ob;
    Generics(T ob) {
        this.ob = ob;
    }
    T getOb() {
        return ob;
    }

    //We have a class named Class.
    //Method getClass() is to return an object of type Class that describes the class of the calling object.
    //After ob.getClass() is called, it returns an object and now we're working with a Class type object to call
    //method getName().
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        //Here we can use class Generics with a flexible type of T. T can be defined as whatever type we want
        Generics<Integer> iOb = new Generics<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value: " + v);
        System.out.println();

        Generics<String> strOb = new Generics<>("Generics Test");
        strOb.showType();
        System.out.println();

        String str = strOb.getOb();
        System.out.println("value: " + str);


    }
}
