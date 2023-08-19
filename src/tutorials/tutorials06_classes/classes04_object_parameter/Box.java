package tutorials.tutorials06_classes.classes04_object_parameter;

/**
 * This class demos the use of passing an obj as a param to a method
 */
public class Box {
    double width;
    double height;
    double depth;

    /**
     * Up to now, we only pass primitive types as params to a method. But here we're passing an obj as a param
     * we will copy all the data (instance vars) of an existing obj (Box type)
     * and then assign them to the instance vars (width, height, depth) of a newly created one.
     * Therefore, this type of constructor is called "copy" constructor.
     * @param ob - an object that we copy the data from
     */
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }

    /**
     * here we use obj1 as an argument to initialize obj4
     * @param args
     */
    public static void main(String[] args) {
        Box obj1 = new Box(1,2,3);
        Box obj4 = new Box(obj1);

        System.out.println(obj1.volume());
        System.out.println(obj4.volume());
    }
}
