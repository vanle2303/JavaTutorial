package tutorials.tutorials08_interface.interface02_nested_interface;

class AClassWithANestedInterface {
    public interface NestedInterface {
        boolean isNotNegative(int i);
    }
}

class ImplementingClass implements AClassWithANestedInterface.NestedInterface {
    public boolean isNotNegative(int i) {
        return i < 0 ? false : true;
        //This statement means that if i is less than 0, return false, otherwise return true
    }
}

public class TestNestedInterface {
    public static void main(String[] args) {
        AClassWithANestedInterface.NestedInterface test = new ImplementingClass();

        System.out.println(test.isNotNegative(10));
        System.out.println(test.isNotNegative(-10));

        if (test.isNotNegative(10)) {
            System.out.println("10 is not negative.");
        }
        if (test.isNotNegative(-10)) {
            System.out.println("This won't be displayed.");
        }
    }
}
