package tutorials.tutorials07_packages_access_modifiers.test_package01;

/**
 * These package and classes demo the use of access modifiers.
 * There are four types of access controls
 *        1. public: accessed by any other code (everywhere)
 *        2. protected: accessed by any members within the same package and subclass objs of
 *                      other package
 *        3. default: accessed within the package
 *        4. private: accessed by other members of its class
 *
 */
public class Person {
    int defaultVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;

    public Person() {
        System.out.println("Base constructor");
        System.out.println("n = " + defaultVar);
        System.out.println("n_pri = " + privateVar);
        System.out.println("n_pro = " + protectedVar);
        System.out.println("n_pub = " + publicVar);
    }
}

class Student extends Person {
    Student() {
        System.out.println("Derived constructor");
        System.out.println("n = " + defaultVar);

        //Since n_pri is declared as private, it can only be accessed by the members of its class
        /*System.out.println("n_pri = " + n_pri);*/

        System.out.println("n_pro = " + protectedVar);
        System.out.println("n_pub = " + publicVar);
    }
}

class Robot {
    Robot() {
        System.out.println("NonDerived constructor");

        Person protection = new Person();
        System.out.println("n = " + protection.defaultVar);

        //Since n_pri is declared as private, it can only be accessed by the members of its class
        /*System.out.println("n_pri = " + n_pri);*/

        System.out.println("n_pro = " + protection.protectedVar);
        System.out.println("n_pub = " + protection.publicVar);
    }
}
