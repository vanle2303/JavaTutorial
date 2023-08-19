package tutorials.tutorials06_classes.classes05_pass_by_ref;

/**
 * primitive types are passed by values
 * when u pass an argument of primitive type to a method, a copy of that argument is made
 * and then the func will use that copy instead of the original value
 * therefore changes made to parameters will not have any effects on the original value
 */
public class PassByValue {
    /**
     * A method that takes 2 params of primitive type
     * @param i
     * @param j
     */
    void tryToChange(int i, int j) {
        //when we're doubling i, we're actually doubling a copy of the arg passed to this func
        i*=2; //i = i * 2
        j/=2; //j = j / 2
    }

    public static void main(String[] args) {
        PassByValue obj = new PassByValue();
        int a = 10, b= 15;
        System.out.println("a and b before call: " + a + " , " + b);
        //here a copy of a and b are created and passed to tryToChange method.
        //changes made inside the tryToChange method will not affect a and b.
        //this is called "pass by value"
        obj.tryToChange(a,b);
        System.out.println("a and b after call: " + a + " , " + b);
    }
}
