package tutorials.tutorials06_classes.classes16_inheritance.inheritance01_super_sub_class;

/**
 * This program demos the defn and the use of superclass and subclasses
 *      1. Superclass: the class that is inherited
 *      2. Subclass  : the class that inherits from the superclass
 * The subclass inherits all the members defined by the superclass and it also adds its own unique elements.
 * The general form of class declaration that inherits the other class is as follows:
 * 		class subclass-name extends superclass-name {}
 * Note: One subclass can inherit from only one superclass.
 *       Java doesn’t support the inheritance of multiple superclasses into one subclass.
 */

/**
 * This is a superclass named Superclass
 */
class Superclass {
    int i;
    int j;
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

/**
 * This demos a subclass that inherits the members of the superclass
 * We create Subclass by extending class Superclass
 * The syntax of inheritance is
 *     class Subclass extends Superclass {}
 */
class Subclass extends Superclass {
    int k;
    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k = " + (i+j+k));
    }
}

public class SuperclassSubclassDemo {
    public static void main(String[] args) {
        Superclass superObj = new Superclass();
        Subclass subObj = new Subclass();

        superObj.i = 10;
        superObj.j = 20;
        System.out.print("Content of superclass: ");
        superObj.showij();

        subObj.i = 1;
        subObj.j = 2;
        subObj.k = 3;
        System.out.print("Content of subclass: ");
        subObj.showij();
        subObj.showK();
        subObj.sum();
    }
}
