package tutorials.tutorials13_generics;

/**
 * This class demos the use of generics, wildcards and instanceof keyword.
 * Wildcards: Sometimes while using a generics class, we don’t want to specify the type of T.
 * Therefore, we need to use wildcard arguments, which is specified by ? representing an unknown type.
 * Note that in this version of Java, we can use:
 *       if (integerShape instanceof Shape<?>) {}
 * or    if (integerShape instanceof Shape) {}
 * or    if (integerShape instanceof Shape<Integer>) {}
 *
 * but we CANNOT use this:
 *       if (integerShape instanceof Shape<String>) {}
 * don't know why, mb bc integerShape is now of Integer type not String.
 * @param <T>
 */

class Shape<T> {
    T ob;
    Shape(T ob) {
        this.ob = ob;
    }
    T getOb() {
        return ob;
    }
}

class Triangle<T> extends Shape<T> {
    Triangle(T ob) {
        super(ob);
    }
}

public class InstanceOfWithGenericsDemo {
    public static void main(String[] args) {
        Shape<Integer> integerShape = new Shape<>(1);
        Triangle<Integer> integerTriangle = new Triangle<>(2);
        Triangle<String> stringTriangle = new Triangle<>("String Triangle");

        if (integerShape instanceof Shape<?>) {
            System.out.println("integerShape is an instance of Shape");
        } else {
            System.out.println("integerShape is not an instance of Shape");
        }

        if (integerShape instanceof Triangle) {
            System.out.println("integerShape is an instance of Triangle");
        } else {
            System.out.println("integerShape is not an instance of Triangle");
        }

        if (integerTriangle instanceof Triangle<?>) {
            System.out.println("integerTriangle is an instance of GenericSubclass");
        }

        if (integerTriangle instanceof Shape<?>) {
            System.out.println("integerTriangle is an instance of GenericSubclass");
        } else {
            System.out.println("integerTriangle is not an instance of GenericSubclass");
        }

        //This block cant be compiled
        /*if (integerTriangle instanceof Triangle<String>) {
            System.out.println("---integerTriangle instanceof GenericSubclass");
        }*/

        if (stringTriangle instanceof Shape<?>) {
            System.out.println("stringTriangle is instance of GenericSuperclass");
        }

    }
}
