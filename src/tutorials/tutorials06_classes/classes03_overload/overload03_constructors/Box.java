package tutorials.tutorials06_classes.classes03_overload.overload03_constructors;

/**
 * This class demos the overloading of constructors
 * We provide different constructors to define different cases
 * example of Box that defines 3 constructors to initialize the dimensions of the box in various ways
 */
public class Box {
    double width;
    double height;
    double depth;

    /**
     * constructor used when the dimensions are specified
     * @param w
     * @param h
     * @param d
     */
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    /**
     * this is a default constructor (since it takes no params)
     * note: it doesn't matter what happens inside the method, as long as it takes no params, it is called default constructor.
     * for example, we hard-code all the dimensions to -1, which is an unrealistic value for a box dimension.
     * constructor used when no dimensions are specified
     */
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    /**
     * here, we assign all the dimensions to the same length, which defines a cube.
     * constructor used when a cube is created
     * @param length
     */
    Box(double length) {
        width = height = depth = length;
    }
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box obj1 = new Box();
        Box obj2 = new Box(2);
        Box obj3 = new Box(1,2,3);

        System.out.println(obj1.volume());
        System.out.println(obj2.volume());
        System.out.println(obj3.volume());
    }
}
