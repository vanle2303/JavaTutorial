package tutorials.tutorials06_classes.classes16_inheritance.inheritance07_abstract_class;

/**
 * This is another example demonstrating the use of abstract.
 * Note that here we also use the concept of using a superclass variable to reference to a subclass obj
 */

public class ShapeDemo {
    public static void main(String[] args) {
        //We're no more able to instantiate an object of superclass Figure since Figure is now declared as abstract
        /*Figure10 figure = new Figure10(1,2);*/
        Rectangle rectangle = new Rectangle(1,2);
        Triangle triangle = new Triangle(3,4);

        //But we can still declare a variable of class Figure
        //And use this superclass variable to reference to a subclass obj
        Figure f;

        f = rectangle;
        System.out.println(f.area());

        f = triangle;
        System.out.println(f.area());

    }
}

/**
 * This class has to be declared as abstract bc it contains an abstract method
 */
abstract class Figure {
    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    /**
     * Class Figure10 doesnt have the ability to implement method area(), bc it doesnt know what type of shape(triangle,
     * rectangle) it is. Therefore, it has to make this method abstract to require its subclasses to implement it
     * @return
     */
    abstract double area();

    /**
     * This method simply prints out the dims of a 2D shape. Class Figure10 has the knowledge to do it. T
     * Therefore, it implements and its subclasses can inherit it or override it if they want .
     * In general, the abstract superclass should provide as many implementations as possible in order to
     * reduce the word load for subclasses and reduce the code duplicated. It only leaves the things that are
     * very specific to each child class to implement.
     */
    void printInfo() {
        System.out.println("The dimensions are: " + dim1 + " " + dim2);
    }
}

class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("The area of a rectangle: ");
        return dim1*dim2;
    }
}

class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("The area of a triangle: ");
        return dim1*dim2/2;
    }
}