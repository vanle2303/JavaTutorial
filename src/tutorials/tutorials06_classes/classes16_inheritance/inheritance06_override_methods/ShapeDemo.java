package tutorials.tutorials06_classes.classes16_inheritance.inheritance06_override_methods;

/**
 * This class demos another example of overriding method, which is to create a subclass method with the
 * same name and type signature as one method in the superclass.
 * Also, this class presents the concept of run-time polymorphism (tinh da hinh trong qua trinh chay)
 * That is, when an overridden method is called through the superclass reference, Java will automatically refer
 * to the suitable version of that method based on the type of object calling the method at that time.
 * Recall that a superclass reference variable can refer to a subclass object.
 *
 * For example,
 *      1. Create a superclass Figure and 2 subclasses Rectangle and Triangle
 *      2. In each class Figure, Rectangle and Triangle, there's an overriding method "area"
 *      3. Inside method main, we create 3 objects of type Figure, Rectangle and Triangle
 *         and one variable f of type Figure
 *      4. We then assign object figure, rectangle and triangle to f
 *         and use f to call the overridden method
 * We can see that now we're assigning an object of type Triangle (subclass) to a variable of type Figure (superclass)
 * and use that superclass var to call the subclass overriding methods. But it still works out perfectly
 * Figure has a lot of different shapes like triangle, rectangle, etc. and this is an example of polymorphism
 */

public class ShapeDemo {
    public static void main(String[] args) {
        Figure figure = new Figure(1,2);
        Rectangle rectangle = new Rectangle(3,4);
        Triangle triangle = new Triangle(5,6);

        Figure f;

        f = figure;
        System.out.println("Area is " + f.area());

        f = rectangle;
        System.out.println("Area is " + f.area());

        f = triangle;
        System.out.println("Area is " + f.area());
    }
}

class Figure {
    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        System.out.println("Area of Figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("Area of a Rectangle: ");
        return dim1*dim2;
    }
}

class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("Area of a Triangle: ");
        return dim1*dim2/2;
    }
}
