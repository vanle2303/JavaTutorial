package tutorials.tutorials06_classes.classes10_final_keyword;

/**
 * This class demos the use of keyword "final".
 * When a field is declared as final, it becomes a constant and it cannot be changed.
 * When an instance var is final, it must have some value all the time. We can achieve this by either initializing it to
 * some value when we declare it or we can initialize it inside a constructor
 * bc both of these guarantee that the instance variables always have their values.
 *
 */

public class Person {
    //here we initialize a final var when we're declaring it
    final double pi = 3.14;

    //these two will be inited inside the constructor
    final int id;
    final String race;

    Person(int id, String race) {
        this.id = id;
        this.race = race;
    }

    //We CANNOT have this default constructor bc its presence gives users an option to create objects of this
    // class without initializing those final vars
   // Person() {}

    /**
     * It's not legal to set a value to a final var inside a setter like this
     * Bc of 2 reasons:
     * 1. a final variable cannot be changed after being initialized, but this method does that
     *    since we can set new value to the instance var by assigning a new value to it via this method
     * 2. We cannot use this method to init a final var bc from the moment an object is created
     *    to the moment the method is called, the var doesnt have any values. This violates the rule that
     *    final var must have a value
      * @param id
     */
    void setId(int id) {
       //this.id = id;
    }

    void setRace(String race) {
       // this.race = race;
    }

    /**
     * Here, we use keyword final for a parameter
     * A final param gets a value when the method is called. Therefore, we dont need to assign a value
     * to the param inside the parens (u cannot do it to a param anyways)
     * A final param means that u cannot change its value inside the method
     * @param year
     */
    void processPersonInfo(final int year) {
        System.out.println("In " + year + ", this person's ID and race are " + id + " and " + race);
        //year = year + 1;
    }
}
class FinalKeywordDemo {
    public static void main(String[] args) {
        /*Person p = new Person();
        System.out.println(p.pi);
        System.out.println(p.id);
        System.out.println(p.race);*/

        Person p = new Person(123, "Asian");
        System.out.println(p.id);
        System.out.println(p.race);
        p.processPersonInfo(2002);
    }
}
