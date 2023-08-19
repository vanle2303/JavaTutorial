package tutorials.tutorials09_exceptions;

/**
 * This class demos a more practical example of try-catch and exception.
 * In previous programs, exceptions are all specified their types such as IllegalArgumentException, ArithmeticException,
 * ArrayIndexOutOfBoundsException, etc. However, in some programs, we have to create our own type of exceptions.
 * In this program, we're abt to create our own type of exceptions DimensionValuesException.
 * In order to do this, we simply create a new class named DimensionValuesException, which extends a superclass
 * Exception. Inside this class, we don't have to implement anything since this class inherits everything from its superclass.
 * But I still override some methods of the superclass as showing below
 */

class DimensionValuesException extends Exception {
    public DimensionValuesException(String msg) {
        super(msg);
    }
    /*public String getMessage() {
        return "Dimensions are non-negative.";
    }*/
}

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(double width, double height) throws DimensionValuesException {
        if (width>=0 && height>=0) {
            return width*height;
        } else {
            DimensionValuesException e = new DimensionValuesException("Dimensions are non-negative.");
            throw e;
        }
    }
}

public class CustomExceptionsDemo {
    public static void main(String[] args) {
        Rectangle figure1 = new Rectangle(0,0);
        try {
            System.out.println(figure1.area(-1,2));
        } catch (DimensionValuesException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
