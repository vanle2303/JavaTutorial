package tutorials.tutorials06_classes.classes16_inheritance.inheritance03_super_keyword;

/**
 * This class demos the use of keyword "super" to call the parent's constructors
 * "super" is used to avoid duplicating code from superclass in the subclass.
 * "super" has 2 general forms:
 *      1. to call superclass constructor
 *      2. to access a member of the superclass that has been hidden by a member of the subclass
 * In this program, we investigate the 1st property of "super", which is to call superclass constructor
 * Here is its general form:
 *      super(arg-list);
 * In arg-list, we need to list all the arguments needed for the superclass constructor.
 * super() must be the first statement executed inside the subclass’s constructor.
 *
 * For example,
 * We have a superclass Box and its subclass BoxWeight.
 * class Box has its constructor Box to initialize width, length, depth fields of Box.
 * Also, in subclass BoxWeight, we also create a new constructor BoxWeight to initialize
 * width, length, depth and weight fields of BoxWeight.
 * As u can see, we're abt to duplicate code of constructor Box in constructor BoxWeight as follows
 *      BoxWeight(double w, double l, double d, double m) {
 *         width = w;
 *         length = l;
 *         depth = d;
 *         weight = m;
 *     }
 * In order to get rid of this unnecessarily long and duplicated code, we use "super" as follows
 *      BoxWeight(double w, double l, double d, double m) {
 *         super(w, l, d);
 *         weight = m;
 *     }
 */
public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(1,2,3,4);
        System.out.println(myBox1.weight);
        System.out.println(myBox1.volume());
    }
}

class Box {
    double width;
    double length;
    double depth;

    /**
     * This is a copy constructor, which takes an object of class Box as a param
     * @param ob
     */
    Box(Box ob) {
        width = ob.width;
        length = ob.length;
        depth = ob.depth;
    }

    Box(double w, double l, double d) {
        width = w;
        length = l;
        depth = d;
    }

    /**
     * This is a default constructor since it doesn't take any params
     */
    Box() {
        width = -1;
        length = -1;
        depth = -1;
    }

    Box(double len) {
        width = length = width = len;
    }

    double volume() {
        return width*length*depth;
    }
}

class BoxWeight extends Box {
    double weight;

    /**
     * Here we call the constructor of the superclass by using the "super" keyword
     * Note that the superclass has several constructors, and Java will look for the constructor that
     * matches the arg-list
     * @param ob
     */
    BoxWeight(BoxWeight ob) {
        //This is the normal but long way to initialize instance vars
        /*width = ob.width;
        length = ob.length;
        depth = ob.depth;*/
        //This is how we use super() to shorten our code
        //In arg-list, we need to list all the arguments needed for the superclass constructor.
        //In this case, we have to pass a BoxWeight ob
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double l, double d, double m) {
        /*width = w;
        length = l;
        depth = d;*/
        //In arg-list, we need to list all the arguments needed for the superclass constructor.
        super(w, l, d);
        weight = m;
    }

    /**
     * This is a default constructor since it doesn't take any params
     */
    BoxWeight() {
        /*width = -1;
        length = -1;
        depth = -1;*/
        //In arg-list, we need to list all the arguments needed for the superclass constructor.
        //But this is a default constructor, then we don't need to pass any args to super()
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        /*width = length = width = len;*/
        super(len);
        weight = m;
    }

}
