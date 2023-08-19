package tutorials.tutorials06_classes.classes02_constructors;

public class Person {
    int ssn;
    Person(int id) {
        this.ssn = id;
    }

    public static void main(String[] args) {
        Person p1 = new Person(123);
    }
}
