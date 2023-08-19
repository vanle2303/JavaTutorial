package tutorials.tutorials06_classes.classes16_inheritance.inheritance09_class_Object;

/**
 * This class demos several built-in methods of class Object, which is the superclass of all the class in Java
 */

class InheritObjectClassWithoutOverridingMethods extends Object {
    int id;
    String name;

    InheritObjectClassWithoutOverridingMethods(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

class InheritObjectClassWithOverridingMethods extends Object{
    int id;
    String name;

    InheritObjectClassWithOverridingMethods(int id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * Method clone() is to copy all the data of the invoking object and then create a new object with exactly
     * the same data as the invoking one.
     * This method belongs to the superclass Object, and it is protected. We're overriding it following the steps below
     *      1. Create a new object clone
     *      2. Copy all the data of the invoking object to clone
     *      3. Return clone.
     * @return
     */
    public InheritObjectClassWithoutOverridingMethods clone() {
        InheritObjectClassWithoutOverridingMethods clone = new InheritObjectClassWithoutOverridingMethods(0, null);
        clone.id = id;
        clone.name = name;
        return clone;
    }

    /**
     * Overriding method toString(), which is to return the details of the invoking objects
     * Without
     * @return
     */
    public String toString() {
        return id + " " + name;
    }

    /**
     * Overriding method equals() of superclass Object
     * We do so bc if we only inherit and directly call equals() of Object without overriding, Object would never know
     * what's inside subclass InheritObjectClassWithOverridingMethod (what kind of instance vars/object/data/etc.).
     * Therefore, this method just simply compare the address of the invoking and invoked objects.
     * Then this method always returns false.
     * That's the reason why we're overriding equals() in order to let equals() specifically compare the values/data
     * of the 2 objects, instead of the address of the 2 objects
     *
     * Since this is an overriding method from class Object, the param of this method must be type Object
     * We then have to transfer this param into a var of type InheritObjectClassWithOverridingMethods by this syntax
     *          transferred-type var = (transferred-type) Object-type var;
     * @param
     * @return
     */
    public boolean equals(Object other) {
        InheritObjectClassWithOverridingMethods o = (InheritObjectClassWithOverridingMethods) other;
        if (o.id == id && o.name == name) {
            return true;
        }
        return false;
    }

    /**
     * This is not an overriding method, it's just simply an overloading method, which has exactly the same
     * functions as the overriding method equals()
     * These two methods equals() work exactly the same as eo, then we can use either of them
     * @param person
     * @return
     */
    public boolean equals(InheritObjectClassWithOverridingMethods person) {
        if (person.id == id && person.name == name) {
            return true;
        }
        return false;
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        InheritObjectClassWithoutOverridingMethods person1 = new InheritObjectClassWithoutOverridingMethods(123,"Van");
        InheritObjectClassWithoutOverridingMethods person2 = new InheritObjectClassWithoutOverridingMethods(123,"Van");

        //Demos the use of method clone()
        /*System.out.println(person1.clone().id);
        System.out.println(person1.clone().name);*/

        //equals() is to compare the value of the invoking object and the invoked one
        System.out.println(person1.equals(person2));

        //getClass() is to get the name of the class of the invoking object at run-time
        System.out.println(person1.getClass());

        //hashCode() is to return a hash code (int type), which is associated with the invoking object
        System.out.println(person1.hashCode());

        //toString() is to return details that describing the invoking object
        System.out.println(person1);
        System.out.println();

        InheritObjectClassWithOverridingMethods person3 = new InheritObjectClassWithOverridingMethods(123,"Van");
        InheritObjectClassWithOverridingMethods person4 = new InheritObjectClassWithOverridingMethods(123, "Long");

        System.out.println(person3.equals(person4));
        System.out.println(person3.toString());

    }
}
