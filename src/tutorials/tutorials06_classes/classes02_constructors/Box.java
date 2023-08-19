package tutorials.tutorials06_classes.classes02_constructors;
/**
 *  This class demos a constructor for Box
 *  We create a constructor that takes params width, length, depth;
 *  when an obj is created using this constructor, instance vars of the class are also initialized
 *  If we provide any constructor (default or not), then Java will not provide any for u
 *  In other words, Java only provides a default constructor if u dont create any
 *  Constructor has the same name as class
 */
public class Box {
    double width;
    double length;
    double depth;

    //this is a constructor for class Box
    public Box(double width, double length, double depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    double volume() {
        return width * length * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(5,10,15);
        System.out.println("The volume is " + myBox.volume());
    }
}
