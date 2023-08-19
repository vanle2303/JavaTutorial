package tutorials.tutorials06_classes.classes12_nested_inner_classes;

class Outer {
    private int x;

    Outer(int x) {
        this.x = x;
    }

    public class InnerNonStatic {
        void displayInfo() {
            System.out.println("This is InnerNonStatic.");
        }
    }

    static class InnerStatic {
        void displayInfo() {
            System.out.println("This is InnerStatic.");
        }
    }
}
public class Demo3StaticAndNonStaticInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer(1);

        //Bc InnerNonStatic is a non-static class, we need to access it through an obj of an outer class as follows
        Outer.InnerNonStatic nonStatic = outer.new InnerNonStatic();
        nonStatic.displayInfo();

        //However, since InnerStatic is a static class, we can just use the outer class's name to access it
        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        innerStatic.displayInfo();
    }
}
