package tutorials.tutorials06_classes.classes16_inheritance.inheritance03_super_keyword;

/**
 * Here we come to the second use for "super", which is to access a member of the superclass
 * that has been hidden by a member of the subclass.
 * This is the general form
 *      super.member;
 * member can be either a method or an instance variable.
 *
 * For example, in class C, we declare int i and in class D, we also declare the same instance variable int i
 * The i of subclass D hides the i of superclass C.
 * Therefore, in order to access i of class C, we need to use "super":
 *      super.i
 * which refers to i of the superclass, class C
 */
public class AccessSuperclassMems {
    public static void main(String[] args) {

    }
}

class Person {
    int id;
}

class Student extends Person {
    int id;  //This i hides the i in class C
    Student(int a, int b) {
        super.id = id;  //This means the i in class C
        this.id = b;        //This is the i of class D
    }

    void show() {
        System.out.println("This is i of superclass: " + super.id);
        System.out.println("This is i of subclass: " + id);
    }
}

class Shape {
    String name;
    Shape(String name) {
        this.name = name;
    }
}

class Square extends Shape {
    int side;
    Square(String name, int side){
        //we must always call all the superclass constructors inside the subclass's ones
        //This is how we call a superclass constructor inside the subclass constructor
        super(name);
        this.side = side;
    }
}
