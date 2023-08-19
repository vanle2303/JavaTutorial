package tutorials.tutorials06_classes.classes04_object_parameter;

/**
 * This class demos the use of static keyword.
 * static can be put in front of an instance var or a method and that means the instance var or the
 * method will exist even before any obj of the class is created.
 * Therefore, u dont access static fields through obj; instead u access them through the class name.
 * e.g: In the Point class below, there is a static method called compare.
 * In order to access this method, we do: Point.compare(...)
 * However, method areEqual is not static, therefore, in order to call/invoke it, we need to create an
 * instance of the class Point first as follows
 *          Point p = new Point();
 *          p.areEqual(...);
 */
public class Point {
    public static void main(String[] args) {
        Point obj = new Point(3,4);
        Point obj1 = new Point(1,2);
        Point obj2 = new Point(2,3);

        boolean areEqual = Point.compare(obj1,obj2);
        System.out.println(areEqual);

        boolean isEqual = obj1.areEqual(obj2);
        System.out.println(isEqual);
    }
    int a;
    int b;
    Point(int i, int j) {
        a = i;
        b = j;
    }

    /**
     * This method is static, therefore, u can use the class name to call it. See the class cmt for
     * how to call it.
     * This method compares 2 objs that are passed to it through params obj1 and obj2.
     * Since this method is static, it is shared among all the objs of this class.
     * @param ob1 - first obj
     * @param ob2 - second obj to compare with the 1st
     * @return true if they have the same content, otherwise false.
     */
    static boolean compare(Point ob1, Point ob2) {
        if (ob1.a == ob2.a && ob1.b == ob2.b){
            return true;
        }
        return false;
    }

    /**
     * This method compares the invoking obj (the obj that invokes this func) with an obj that is
     * passed to the func through the param obj
     * @param obj
     * @return
     */
    boolean areEqual(Point obj) {
        if (obj.a == a && obj.b == b) {
            return true;
        }
        return false;
    }

}
