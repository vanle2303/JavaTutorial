package tutorials.tutorials14_lambda.methodReferences;

/**
 * This class demos the use of method reference to instance method associated with generics.
 * The syntax fof method reference to instance method is:
 *      objRef::methodName
 *
 * @param <T>
 */

interface MyFunction<T> {
    boolean func(T value1, T value2);
}

class HighTemp {
    private int threshold;
    HighTemp(int threshold) {

        this.threshold = threshold;
    }
    boolean sameTemp(HighTemp temp) {
        System.out.println("Threshold = " + temp.threshold);
        return threshold == temp.threshold;
    }
    boolean lessThanHighTemp(HighTemp temp) {
        return threshold < temp.threshold;
    }
}

public class MethodReferenceToInstanceMethod {
    static <T> int counter(T[] vals, MyFunction<T> f, T target) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], target)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int count;
        HighTemp[] weekDaysHigh = {
                new HighTemp(25),
                new HighTemp(26),
                new HighTemp(27),
                new HighTemp(28),
                new HighTemp(29)
        };
        count = counter(weekDaysHigh, HighTemp::sameTemp, new HighTemp(24));
        System.out.println(count + " days have the high temp of 25");

        count = counter(weekDaysHigh, HighTemp::sameTemp, new HighTemp(30));
        System.out.println(count + " days have the high temp of 30");

        count = counter(weekDaysHigh, HighTemp::lessThanHighTemp, new HighTemp(27));
        System.out.println(count + " days have the high temp less than 27");

    }
}
