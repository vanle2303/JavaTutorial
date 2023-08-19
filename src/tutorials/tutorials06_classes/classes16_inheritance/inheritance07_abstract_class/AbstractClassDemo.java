package tutorials.tutorials06_classes.classes16_inheritance.inheritance07_abstract_class;

/**
 *      This class demos Abstract Class. Specifically, we will create abstract methods inside the superclass,
 * which only give the general forms (declaration/signature) of the methods. Then it is the responsibility of the
 * subclasses to implement these abstract methods by adding the body to them. In other words, subclasses inherit and
 * add its own specific details into those abstract methods.
 *      We use abstract to get rid of some unnecessary/meaningless details inside the methods of the superclass
 * and then let the subclasses add their own details to those abstract methods. Specifically, a lot of times
 * the parent class (eg: Shape) doesnt have enough details to omplement some methods (eg: area()), but it want to
 * enforce all of its subclasses (eg: Triangle, Rectangle, etc.) to implement area(). That is the meaning of abstract
 * methods
 * For example, in class Figure, in the previous example, we simply return 0, which is not only meaningless,
 * but it also may cause confusion bc subclassers may misunderstand that it has already been implemented by the
 * superclass. Therefore, we'd better make it an abstract method instead.
 * Class area() is simple just a placeholder, so we should declare it as abstract to force all
 * subclasses to implement abstract methods on its own.
 *      This is how we declare an abstract method:
 *              abstract method-name(param-list);
 * NOTES:
 *      1. A class can contain as many abstract methods as it wants to.
 *         But that class must also be declared as "abstract".
 *      2.There're no objects of an abstract class. That is, we cannot create/instantiate a new object of
 *        an abstract class using "new" operator
 *      3.CANNOT declare abstract constructors or abstract static methods
 *        For abstract constructors, since all subclasses must implement abstract methods inside subclasses,
 *        and if superclass constructor is also declares as abstract, then subclasses also have to implement
 *        constructor of superclass. Of course, it's definitely not the subclasses' business to implement
 *        superclass constructor.
 *        Next, static methods belong to a class not an object, so we use class name to call all static methods.
 *        Abstract static methods have no bodies or meaning. Therefore, it's illegal to use a class
 *        to call a meaningless method.
 *      4.Subclasses of abstract superclass must either implement abstract methods or also be declared as abstract
 *
 *
 */
public class AbstractClassDemo {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.callMe();
        ob.callMeToo();
    }
}

abstract class Parent {
    abstract void callMe();

    void callMeToo() {
        System.out.println("This is a concrete method.");
    }
}

class Child extends Parent {
    void callMe() {
        System.out.println("Child's implementation of method callMe.");
    }
}
