package tutorials.tutorials08_interface.interface01_define_implement_interfaces;

/**
 * This class simple introduces us the definition of "interface".
 * Specifically, using interface, we can fully abstract a class's interface from its implementations
 * That is, we create an interface to LIST all the methods need to be used, these methods
 * have nothing but signature/declaration (have no bodies)
 * And we then use a class to implement the methods of that interface.
 * interface allows us to fully use "one interface, multiple methods", which is a unique
 * aspect of polymorphism
 * We define an interface like a class:
 *      access-modifier  interface  name {}
 * Here is how we implement an interface:
 *      access-modifier  class  class-name  implements interface-name {}
 *
 * Note: 1. If a class implements more than 1 interface, we simply separate the interfaces' name
 *          with a comma
 *       2. We have to declare public for the methods implementing an interface
 *       3. If a class implements an interface but it doesnt fully implement/doesnt implement
 *          any of the methods declared inside the interface, that class MUST be declared
 *          as ABSTRACT. Any subclasses inheriting that abstract class must implement
 *          all the methods of the interface or those subclasses must also be declared as abstract.
 *
 */

public interface CallBack {
    void callBack(int param);
}

class Client implements CallBack {
    public void callBack(int p) {
        System.out.println("callBack called with " + p);
    }

    /**
     * note that a class implementing definitely can add its own members
     */
    public void nonInterfaceMethod() {
        System.out.println("Classes that implement interfaces "
                            + "may also define other members, too");
    }
}

class AnotherClient implements CallBack {
    public void callBack(int p) {
        System.out.println("Another version of callBack");
        System.out.println("p squared is " + p*p);
    }
}

/**
 * This class shows us a new concept that is accessing implementation through interface reference.
 * Specifically, we create a variable of interface type and then assign it to an object
 * of the implementing class. We then use that variable to call all the methods declared inside
 * the interface. This method works pretty much alike the concept of a superclass variable
 * referencing to an object of the subclass
 */
class TestInterface {
    public static void main(String[] args) {
        //We're creating a variable c of the interface CallBack, then assigning an object
        //of class Client. Then use c to call the method of the interface.
        //Since now c is referring to Client object, it's calling method callBack()
        //of class Client
        CallBack c = new Client();
        c.callBack(12);

        //However, here, we assign an object of class AnotherClient() to c
        //Now c is referring to an object of type AnotherClient
        //Therefore, c is gonna call method callBack() of class AnotherClient
        AnotherClient p = new AnotherClient();
        c=p;
        c.callBack(12);
    }
}
