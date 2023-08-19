package tutorials.tutorials06_classes.classes08_access_control;

/**
 * There are four types of access controls
 *      1. public: accessed by any other code
 *      2. default: accessed within the package
 *      3. private: accessed by other members of its class
 *      4. protected: further info in Inheritance chapter
 * This program will demonstrate the difference between public and private
 */
public class PublicAndPrivate {
    int a;          //default access
    public int b;   //public access
    private int c;  //private access

    //method to access c
    //Bc c is private, it cannot be used directly.
    //It must be accessed through its public methods: setC and getC
    void setC(int i) {
        c = i;
    }
    int getC() {
        return c;
    }
}

class PublicPrivateTest {
    public static void main(String[] args) {
        PublicAndPrivate obj = new PublicAndPrivate();

        obj.a = 10;     // these are ok
        obj.b = 20;     //since a and b are public, so they can be accessed directly

        //obj.c = 30
        //This is not ok. Since c is private, it can not be accessed like this

        //Here is how we access to get c
        obj.setC(30);
        int c = obj.getC();

        System.out.println("a, b and c are " + obj.a + " , " + obj.b + " , " + c);
    }
}
