package tutorials.tutorials06_classes.classes16_inheritance.inheritance04_multilevel_hierachy;

/**
 * This class demos the use of multilevel hierarchy, which contains as many inheritance as we desire.
 * In other words, multilevel hierarchy is to use a subclass to be the superclass of another
 * When it comes to multilevel hierarchy, a subclass inherits all the traits of its superclasses
 * For example, we have 3 classes A, B, C. C is the subclass of B and B is the subclass of A.
 * C will inherit all members of its superclasses B and A
 */
public class BoxDemo {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(1,2,3,4,5.5);
        Shipment shipment2 = new Shipment(6,7,8,9,10.5);

        System.out.println("Volume of shipment1: " + shipment1.volume());
        System.out.println("The weight of shipment1: " + shipment1.weight);
        System.out.println("The cost of shipment1: $" + shipment1.cost);

        System.out.println("Volume of shipment2: " + shipment2.volume());
        System.out.println("The cost of shipment2: $" + shipment2.cost);
    }
}

class Box {
    private double width;
    private double length;
    private double depth;

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

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double l, double d, double m) {
        super(w,l,d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight {
    double cost;
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double l, double d, double m, double c) {
        super(w,l,d,m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

