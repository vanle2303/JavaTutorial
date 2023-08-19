package tutorials.tutorials06_classes.classes01_a_basic_class;

public class Box {
    /**
     *  constructor for Box
     *  a constructor is called to create a new obj and optionally initialize it (if constructor takes any params)
     *  a constructor that doesnt take any params, Java will create a default constructor.
     *  if u dont provide any constructor, Java will provide u a default one
     *  constructor has the same name as class
     */
    Box() {
    }

    private double width;
    private double length;
    private double depth;

    /**
     * This is an instance method
     * In order to call this method, we need to have an instance of class Box
     * This method operates on the instance vars width, length, depth.
     * Each instance has its own copy of these instance vars, therefore, this method returns its own volume
     * @return
     */
    double volume(){
        return width * length * depth;
    }

    /**
     * This method is to set a value for instance var "width" by assigning w to it.
     * In other words, it assigns w to width.
     * The reason for using this method is that we can control which value can be passed to the param.
     * So that users cannot pass any random values to the param
     * For example, we have a method to set the age for a person.
     * and assume that someone passes a value of 1000 to this method.
     * In this case, we will throw an error, instead of accepting and setting that value to age.
     * @param w - width of a box
     */
    void setWidth(double w){
        width = w;
    }
    void setLength(double l) {
        length = l;
    }
    void setDepth(double d) {
        depth = d;
    }

    /**
     * This method is to get the value of instance var width.
     * Since we set width as private, users cannot access it outside of this scope.
     * @return
     */
    double getWidth() {
        return width;
    }
    double getLength() {
        return length;
    }

    double getDepth( ){
        return depth;
    }

}


class BoxDemo {
    public static void main(String[] args) {
        //Box myBox = new Box();
        Box myBox;
        myBox = new Box();
        myBox.setWidth(5);
        myBox.setLength(10);
        myBox.setDepth(15);

        double v = myBox.volume();
        System.out.println(v);
        ////////////////////

        double w = myBox.getWidth();
        double l = myBox.getLength();
        double d = myBox.getDepth();

    }

}

