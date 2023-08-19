package tutorials.tutorials06_classes.classes16_inheritance.inheritance05_constructors_executing_order;

/**
 * This class demos the order in which constructors of class hierarchy are called.
 * We have 3 classes Parent, Child, GrandChild. All of which have default constructors.
 *
 * Note that the constructor of the subclass always has to call one of the constructor of the superclass
 * implicitly (Java automatically does this) or explicitly (we manually do it).
 *      - Recall that if we dont call the constructor of the superclass inside the constructor of the subclass,
 *       then Java will automatically call the default constructor of the superclass as the very first statement
 *       during the execution of the subclass constructor.
 *      - If the superclass has non-default constructors, then we have to call one of them explicitly as the first
 *      statement inside the constructor of the subclass.
 *
 * In the example below:
 *      1. We call constructor of Grandchild. Seems like we dont call the constructor of Child explicitly here
 *      Java will call the default constructor of Child implicitly for us.
 *      2. The default constructor of Child is called, which similarly triggers (cham ngoi, kich no, gay ra)
 *      the default constructor of Parent to be called.
 *      3. The default constructor of Parent is called and finished.
 *      4. The default constructor of Child continues and then finishes.
 *      5. The default constructor of Grandchild continues and then finishes.
 */
public class OrderOfExecutingConstructors {
    public static void main(String[] args) {
        GrandChild ob = new GrandChild();
    }
}

class Parent {
    Parent() {
        System.out.println("Constructor Parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Constructor Child");
    }
}

class GrandChild extends Child {
    GrandChild() {
        System.out.println("Constructor GrandChild");
    }
}
