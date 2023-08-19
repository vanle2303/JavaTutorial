package tutorials.tutorials06_classes.classes12_nested_inner_classes;

class OuterClass {
    int outer_x = 100;

    void test() {
        InnerClass inner = new InnerClass();
        inner.display();
    }

    class InnerClass {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}

public class Demo1InnerClassBasic {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.test();
    }
}


