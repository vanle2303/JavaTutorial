package tutorials.tutorials13_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demos a dynamic stack, which is a stack with a changeable length.
 * The class also introduces a new syntax of Collections Framework as the following example:
 *      List<T> stack = new ArrayList();
 * @param <T>
 */

class Stack<T> {
    //List is an interface and ArrayList is a class which implements List
    List<T> stack = new ArrayList();
    int topOfSTack;

    Stack() {
        topOfSTack = -1;
    }

    void push(T item) {
        //stack[++topOfSTack] = item;
        //Here, we can basically call method .add() of interface List
        stack.add(++topOfSTack, item);
    }

    T pop() {
        if (topOfSTack < 0) {
            System.out.println("Stack underflow");
            return null;
        }
        //Since we'll use method .get(), which basically returns the value of the stack but does not delete that value.
        //Therefore, in order to save memory efficiently, we should also use method .remove() after getting the needed
        //value to save memory space.
        //However, once we use method remove(), we'll lose that value. Therefore, at first we need to save that value
        //into a variable in order not to lose it.
        T value = stack.get(topOfSTack);
        stack.remove(topOfSTack);
        topOfSTack--;
        return value;
    }

}

public class StackWithGenericsDemo {
    public static void main(String[] args) {
        System.out.println("Stack with type Integer");
        Stack<Integer> intStack = new Stack<Integer>();
        for (int i = 1; i < 10; i++) {
            intStack.push(i);
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(intStack.pop());
        }

        System.out.println("Stack with type String");
        Stack<String> stringStack = new Stack<>();
        stringStack.push("a");
        stringStack.push("b");
        stringStack.push("c");
        stringStack.push("d");
        for (int i = 1; i < 10; i++) {
            System.out.println(stringStack.pop());
        }
    }
}
