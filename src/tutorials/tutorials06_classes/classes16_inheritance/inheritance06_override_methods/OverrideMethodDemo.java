package tutorials.tutorials06_classes.classes16_inheritance.inheritance06_override_methods;

/**
 * This class demos overriding methods, which is to use a method inside subclass with the same name and type
 * signature as a method of superclass.
 *
 * Consider example of class FirstChild
 *      1. We create a superclass with its method named displayInfo(), which prints out info related to superclass
 *      2. We then create a subclass which also has a method displayInfo(), which prints out info related to subclass
 *         However, inside the method, we dont use "super" to call method displayInfo() of superclass
 *      3. In method main, we declare and initialize an object of Subclass07 and use that object to call method displayInfo()
 *      4. This call refers to the method of the subclass, rather than the one created inside superclass.
 *      Therefore, the result printed out is just to show the value k of the subclass.
 *
 * Consider example of class SecondChild
 *      1. Create a subclass SecondChild07 extending the subclass Parent
 *      2. Inside this class, we create an overriding method displayInfo() to prints out info related to this subclass.
 *         And we also call method displayInfo() of the superclass using super.displayInfo();
 *      3. Therefore, when we use SecondChild ob2 to call displayInfo(), it will also call displayInfo() of the
 *      superclass
 *      Overall, this time, the result printed out is i, j, k, since both methods of the subclass and superclass
 *      are called
 *
 */
public class OverrideMethodDemo {
    public static void main(String[] args) {
        FirstChild ob1 = new FirstChild(1,2,3);
        ob1.displayInfo();

        SecondChild ob2 = new SecondChild(4,5,6);
        ob2.displayInfo();

        ob2.foo();
    }
}

class Parent {
    int i;
    int j;

    Parent(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void displayInfo() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class FirstChild extends Parent {
    int k;
    FirstChild(int i, int j, int k) {
        super(i,j);
        this.k = k;
    }

    void displayInfo() {
        System.out.println("k: " + k);
    }
}

class SecondChild extends Parent {
    int x;
    SecondChild(int i, int j, int x) {
        super(i,j);
        this.x = x;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("x: " + x);
    }

    @Deprecated
    void foo() {}
}
