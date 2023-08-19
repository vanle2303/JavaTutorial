package tutorials.tutorials10_enumerations;

/**
 * Enumeration `enum` is a list of all defined constants, those constants are all set with values and new data type,
 * which is the enum type. We can use enumeration to control param values that we can pass to a method when we call it
 * enum works exactly like a class with final variables, any objects of this type can only receive those specified
 * values listed in the enum.
 * We cannot instantiate an enum using new operator, we can just declare an enum variable, for example:
 *      enum Apple {}
 *      class AppleTest{
 *          Apple apple; //declare an Apple variable
 *      }
 * In order to access enum data, we use dot operator like below
 *      Apple.RedDel
 *
 * Note1: enumeration automatically contains 2 methods: values() and valuesOf():
 *      1. public static enum-type[] values(): returns an array listing all the enumeration variables
 *      2. public static enum-type valuesOf(String str): returns the enumeration constant corresponding to the string
 *      passes in str
 *
 * Note2:
 *      1. Enum CANNOT inherit another class
 *      2. Enum CANNOT be a superclass
 */

/**
 * Here is an example of an enum, which lists some kinds of available fruits.
 * And id we use this Fruit type, we can only use 4 variables listed inside enum Fruit
 */
enum Fruit {
    APPLE,
    ORANGE,
    KIWI,
    PLUM,
}

public class EnumerationDemo {

    public static String getFruitName(Fruit fruit) {
        if (fruit == Fruit.APPLE) {
            return "Apple";
        } else if (fruit == Fruit.ORANGE) {
            return "Orange";
        } else if (fruit == Fruit.KIWI) {
            return "Kiwi";
        } else {
            return "Plum";
        }
    }

    static String getTypesOfFruits(int number) {
       if (number == 1) {
           return "Oranges";
       } else if (number == 2) {
           return "Apples";
       } else {
            return "Unknown Fruits";
       }
   }
}

/**
 * Here is another example of enum named Apple
 */
enum Apple {
    Jonathan(1),
    GoldenDel(2),
    RedDel(3),
    Winesap(4),
    Cortland(5);

    int id;
    Apple(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

}

class AppleDemo {
    public static void getAppleType(Apple apple) {
        switch (apple){
            case Jonathan:
                System.out.println("Jonathan is red.");

                //Method ordinal() returns the ordinal value of the invoking constant, and this value begins at 0
                System.out.println("Ordinal = " + apple.ordinal());
                System.out.println("ID = " + apple.getId());
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }
    }
}

class TestBuiltInEnumerationMethods {
    public static void getAllEnumValues() {
        System.out.println();
        System.out.println("Here are all types of apples.");

        //Here we are using the built-in method values() to get all the values of an enum
        Apple[] allApples = Apple.values();
        for (Apple apple : allApples) {
            System.out.println(apple);
        }
    }

    public static void getSpecificEnumValue(String string) {
        //Here we are using method valuesOf() and pass a string to the param. If there's a result in the enum matching
        //with the string passes to the param, the result will be printed out
        Apple apple = Apple.valueOf(string);
        System.out.println("Apple contains " + apple);
    }
}

class EnumerationTest{
    public static void main(String[] args) {
        System.out.println(EnumerationDemo.getTypesOfFruits(1));
        System.out.println(EnumerationDemo.getTypesOfFruits(2));
        System.out.println(EnumerationDemo.getTypesOfFruits(3));

        System.out.println(EnumerationDemo.getFruitName(Fruit.APPLE));

        Apple apple;
        apple = Apple.Jonathan;
        AppleDemo.getAppleType(apple);

        TestBuiltInEnumerationMethods.getAllEnumValues();
        TestBuiltInEnumerationMethods.getSpecificEnumValue("Jonathan");
        /*TestBuiltInEnumerationMethods.getSpecificEnumValue("Van");*/

        System.out.println("Hello ");
    }
}
