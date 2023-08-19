package tutorials.tutorials06_classes.classes08_access_control;

/**
 * This class defines a stack that holds up to 10 integers
 * And we will use control access "private" in this program
 */
public class StackWithPrivateInstanceVars {
    //Now both stck and tos are private, which means they cannot be altered in the way
    //that would be harmful to the stack

    //Generally we would provide getters and setters for private instance vars
    //However, in this program, we dont want to use setters or getters.
    //If we provide these setters and getters, users would be able to access,
    //and even print out all the values of the stack in a random way.
    //Even worse, they would change the values of these fields and mess up the data structures of the stack
    //such as changing the value of topOfStack. Consequently, we would lose the properties of a stack,
    //which is FILO
    //In this program, in fact, we have something similar to setters and getters, but more sophisticated
    //methods push and pop work pretty much like setters and getters,
    //but they are unique methods used for stack.

    private int[] stck = new int[10];
    private int topOfStack;

    //Initialize top of the stack to -1 to indicate that currently there's no element in the stack
    StackWithPrivateInstanceVars() {
        topOfStack = -1;
    }

    //Push an item onto the stack
    void push(int item) {
        if (topOfStack == 9) {
            System.out.println("Stack is full");
        } else {
            //each time we push an item onto the stack, we increment the index first before we push onto the stack.
            //this explains why we put the double plus sign IN FRONT of the index
            stck[++topOfStack] = item;
        }
    }

    //Pop an item out of the stack
    int pop() {
        if (topOfStack < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            //we pop first then we decrement, this explains why we put the double minus signs BEHIND the index
            return stck[topOfStack--];
        }
    }
}

class StackWithPrivateInstanceVarsDemo {
    public static void main(String[] args) {
        StackWithPrivateInstanceVars myStack1 = new StackWithPrivateInstanceVars();
        StackWithPrivateInstanceVars myStack2 = new StackWithPrivateInstanceVars();

        //push some numbers onto the stack
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }
        //pop values out of the stack
        System.out.println("Stack in myStack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Stack in myStack2: ");
        for (int i = 10; i < 20; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
