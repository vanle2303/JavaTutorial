package tutorials.tutorials08_interface.interface04_extend_interface_and_default_methods;

/**
 * This class demos the concept of an interface extending another interface. This works exactly like
 * extending classes.
 * In addition, this class also demos the default interface methods. When an interface method is declared
 * as default, it isnt required to be implemented by other class, we can just simply use it.
 *
 */

public interface Methods {
    void method1();
    void method2();
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

interface AnotherMethod extends Methods{
    void method3();
}

class ImplementingClass implements AnotherMethod {
    @Override
    public void method1() {
        System.out.println("Implement method1().");
    }

    @Override
    public void method2() {
        System.out.println("Implement method2().");
    }

    @Override
    public void method3() {
        System.out.println("Implement method3().");
    }
}

class TestingClass {
    public static void main(String[] args) {
        ImplementingClass test = new ImplementingClass();

        test.method1();
        test.method2();
        test.method3();
        test.defaultMethod();
    }
}