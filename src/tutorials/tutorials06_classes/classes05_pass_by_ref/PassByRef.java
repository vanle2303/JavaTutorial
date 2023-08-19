package tutorials.tutorials06_classes.classes05_pass_by_ref;

/**
 * objs are passed by reference
 * recall that an obj var is actually a pointer or a reference; it points to the address of that
 * obj in the memory space.
 * assume we pass an object obj to a function f, a copy of obj (obj1) is created and used by f.
 * however, obj and obj1 point to the same object and therefore if we make change to the object
 * via obj1, we actually make changes to the object in the memory space itself.
 * therefore, if we use obj to access the attributes of the object, we'll see the new changes
 *
 */

class Point {
    int a;
    int b;
    Point(int i, int j) {
        a = i;
        b = j;
    }

    /**
     * this method takes an object as a param.
     * as explained above, this is passed by ref. therefore, if we make changes to a Point object
     * inside this method via obj, we'll leave the consequences to the object even after
     * the execution of this func has finished.
     * eg: here we double a and halfen b, and the changed will remain after the func exits.
     * @param obj
     */
    void meth(Point obj) {
        obj.a *= 2;
        obj.b /= 2;
    }

}

public class PassByRef {

    public static void main(String[] args) {
        Point obj = new Point(1,2);
        System.out.println("obj.a and obj.b before call: " + obj.a + " , " + obj.b);
        obj.meth(obj);
        System.out.println("obj.a and obj.b after call: " + obj.a + " , " + obj.b);
    }
}
