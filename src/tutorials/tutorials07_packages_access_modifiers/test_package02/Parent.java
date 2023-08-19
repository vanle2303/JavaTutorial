package tutorials.tutorials07_packages_access_modifiers.test_package02;

import tutorials.tutorials07_packages_access_modifiers.test_package01.Person;

/**
 * These package and classes demo also demo the use of access modifiers, specifically
 * how access modifiers can control the way we access members of other packages
 * This package also shows us how to import packages and classes into a package/class.
 * We can import a package/class in 2 ways:
 *      1. Access explicitly:
 *          `public class Parent02 extends tutorials.tutorials07_packages.packages02_access_modifiers.test_package01.Parent01;`
 *      2. Use keyword "import" right behind declaring the package:
 *          `import tutorials.tutorials07_packages.packages02_access_modifiers.test_package01.Parent01;`
 *
 */
public class Parent extends Person {
    Parent() {
        System.out.println("derived other package constructor");

        //Default can be accessed by within its package
        //System.out.println("n = " + defaultVar);

        //private can be accessed by other members of its class
        //System.out.println("n_pri = " + privateVar);

        System.out.println("n_pro = " + protectedVar);
        System.out.println("n_pub = " + publicVar);
    }

}

class Stranger {
    Stranger() {
        Person p = new Person();
        System.out.println("other package constructor");

        //Default can be accessed by within its package
        /*System.out.println("n = " + p.defaultVar);*/

        //private can be accessed by other members of its class
        /*System.out.println("n_pri = " + p.privateVar);*/

        //protected can be accessed within the package or by subclass objects
        /*System.out.println("n_pro = " + p.protectedVar);*/

        //public can be accessed by any other code
        //Here, we access it by using object p of type Parent01 to call it
        System.out.println("n_pub = " + p.publicVar);
    }
}
