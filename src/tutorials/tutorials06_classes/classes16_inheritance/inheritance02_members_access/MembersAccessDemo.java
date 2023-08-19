package tutorials.tutorials06_classes.classes16_inheritance.inheritance02_members_access;

/**
 * This class demos member access in inheritance
 * If in superclass, we declare a variable as private, we cannot access that var in subclass
 */
public class MembersAccessDemo {
    public static void main(String[] args) {
        Child subObj = new Child();

        //Even though we cannot access j directly, we can still set its value indirectly through calling
        //the setij() method.
        //In fact, this is the only way we can set values for private members (through setters)
        subObj.setij(1,2);

        //j is a private var of superclass A
        //and we use j inside method sum of subclass B
        //There's no access to j in class B. Therefore this program will not compile
        /*subObj.sum();*/
    }
}

//This is a superclass
class Parent {
    //i is declared default access, which means it can be accessed within the package
    int i;
    //j is declared as private access, which means it can only be accessed bu other members of its class
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

//This is a subclass
//Even though B inherits A, B CANNOT access j, since j is private
//B can only access i
class Child extends Parent {
    int total;
    /*void sum() {
        total = i + j; //ERROR bc j cannot be accessed here
    }*/
}



