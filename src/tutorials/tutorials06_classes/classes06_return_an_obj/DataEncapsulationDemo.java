package tutorials.tutorials06_classes.classes06_return_an_obj;

import java.util.Date;

/**
 * This class demos the use of encapsulation.
 * Assume we have a method that needs to return a float value, a String value and a Date value altogether
 * How can we return all of them at the same time?
 * To do this, we need to create a class that encapsulates all of these data as its instance vars.
 * Subsequently, we can create an obj of this class and initialize that object.
 * We then return all the data of that object.
 * Specifically, we need to convert USD to VND and we want to retuen several values together:
 *     float value, today date, name of currency, etc.
 * To do this , we create a class called currency that encapsulates all these fields.
 * Then inside the method that returns a currency, we create a new obj of type Currency and return it.
 * There u go; by returning an obj of type Currency, we return several pieces of data of different types.
 */
 class  Currency {
    float value;
    Date date;
    String from;
    String to;
}

public class DataEncapsulationDemo {
    Currency getVndFromOneDollar() {
        //Here we create an obj of type Currency adn return it
        //Here we hard-code everything and simply return it for demo purposes
        Currency c = new Currency();
        c.value = 23300;
        c.date = new Date();
        c.from = "USD";
        c.to = "VND";
        return c;
    }

    public static void main(String[] args) {
        DataEncapsulationDemo demo = new DataEncapsulationDemo();
        Currency c = demo.getVndFromOneDollar();
        System.out.println(c.value);
        System.out.println(c.date);
        System.out.println(c.from);
        System.out.println(c.to);
    }
}
