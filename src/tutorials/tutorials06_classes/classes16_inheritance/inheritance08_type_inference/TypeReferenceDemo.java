package tutorials.tutorials06_classes.classes16_inheritance.inheritance08_type_inference;

public class TypeReferenceDemo {
    public static void main(String[] args) {
        var obj1 = getInfo(0);
        var obj2 = getInfo(1);
        var obj3 = getInfo(2);
        //Since the type return of method getInfo is Parent, obj1,obj2,obj3 are all type Parent
        //Therefore, 3 of them cannot call x or y since x, y dont belong to class Parent
        //Eg: This is illegal /*obj1.x*/ or /*obj2.y*/
    }

    static Parent getInfo(int which) {
        switch (which) {
            case 0: return new Parent();
            case 1: return new Child();
            default: return new GrandChild();
        }
    }
}

class Parent {

}

class Child extends Parent {
    int x;
}

class GrandChild extends Child {
    int y;
}
