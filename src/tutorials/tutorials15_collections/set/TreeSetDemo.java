package tutorials.tutorials15_collections.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * This class is an example of getting the name and the corresponding GPA of a person
 * It is a combination knowledge of class, class vars, overriding method/constructor, TreeSet,
 * and method iterator()
 */

/**
 * Here is basically a class Person with 2 instance vars: name and gpa
 */
class Person {
    String name;
    double gpa;
    Person(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    /**
     * Normally, when we need to print out an object, Java will automatically and implicitly call
     * method toString() of class Object. However, this built-in method would not know what
     * the customized info is to print them out. Therefore, we have to override method toString()
     * to customize it in order that it returns our desired info.
     * Here, we override toString() to print out the content of name and gpa
     * Note that in order to use object of Person to call this method, we have to override it inside
     * class Person, but not anywhere else. If we dont override it inside Person, and use Person
     * obj to call toString(), Java will call toString() of class Object
     * @return
     */
    public String toString() {
        return "Name: " + name + "  GPA: " + gpa;
    }
}

/**
 * This class is to implement method compare() of interface Comparator
 */
class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        //Just change the operator < or >, we can change the order of printed out info
        //from highest gpa to lowest or from lowest gpa to highest
        if (p1.gpa > p2.gpa) {
            return 1;
        } else if (p1.gpa == p2.gpa) {
            return 0;
        } else {
            return -1;
        }
    }
}


public class TreeSetDemo {
    public static void main(String[] args) {

        //TreeSet has several constructor and this is one of the way to declare a set using TreeSet
        TreeSet<Person> personTreeSet = new TreeSet<>(new PersonComparator());

        Person p1 = new Person("Van", 3.8);
        Person p2 = new Person("Long", 3.9);
        Person p3 = new Person("Giang", 4.0);
        Person p4 = new Person("Truong", 3.7);

        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);

        //This demos method iterator() and the way to use it effectively
        //1. When iterator() is called, it creates a reference to the first element of the collection
        //2. Method hasNext() is to check if there's a next element or not
        //   If yes, method next() is called
        //3. next() is executed, it returns the currently referred element and then move the reference
        //   to the next element of the collection
        Iterator<Person> it = personTreeSet.iterator();
        while (it.hasNext()) {
            Person person = it.next();
            System.out.println(person);
        }

        //However, we can use for-each block as an alternative to Iterator
        //For example:
        //ArrayList<Integer> vals = new ArrayList<>();
        //vals.add(1);
        //vals.add(2);
        //for(int v : vals) {
        //      sout(v);
        // }
    }


}
