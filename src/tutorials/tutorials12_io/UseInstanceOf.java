package tutorials.tutorials12_io;

/**
 * This class demos the use of operator instanceof.
 * For example,
 *      if (parent instanceof Parent) {sout}
 * This statement means that if object parent is an instance of class Parent, then the sout clause will be executed.
 *
 */

class Parent {
    int i;
    int j;
}

class ARandomClass {
    int i;
    int j;
}

class Child1 extends Parent {
    int k;
}

class Child2 extends Parent {
    int k;
}

public class UseInstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent();
        ARandomClass aRandomClass = new ARandomClass();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        if (parent instanceof Parent) {
            System.out.println("parent is an instance of Parent.");
        }
        if (aRandomClass instanceof ARandomClass) {
            System.out.println("aRandomClass is an instance of ARandomClass.");
        }
        if (child1 instanceof Parent) {
            System.out.println("child1 can be cast to Parent.");
        }
        if (parent instanceof Child1) {
            System.out.println("parent can be cast to Child1.");
        }
        System.out.println();

        Parent anotherParent;
        anotherParent = child2;
        System.out.println("anotherParent is now referred to child2.");
        if (anotherParent instanceof Child2) {
            System.out.println("anotherParent is an instance of Child2.");
        }
        System.out.println();

        anotherParent = child1;
        System.out.println("anotherParent is now referred to child1.");
        if (anotherParent instanceof Child2) {
            System.out.println("anotherParent can be cast to Child2.");
        } else {
            System.out.println("anotherParent cannot be cast to Child2.");
        }
        if (anotherParent instanceof Parent) {
            System.out.println("anotherParent can be cast to Parent.");
        }
        System.out.println();

        //All objects can be cast to class Object
        if (parent instanceof Object) {
            System.out.println("parent may be cast to Object.");
        }
        if (anotherParent instanceof Object) {
            System.out.println("anotherParent may be cast to Object.");
        }
    }
}

