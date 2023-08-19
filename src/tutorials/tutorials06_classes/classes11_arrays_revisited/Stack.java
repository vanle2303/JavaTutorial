package tutorials.tutorials06_classes.classes11_arrays_revisited;

public class Stack {
    private int stack[];
    private int topOfStack;

    //allocate and initialize stack
    Stack(int size) {
        stack = new int[size];
        topOfStack = -1;
    }

    //push an item onto the stack
    void push(int item) {
        if (topOfStack == ( stack.length-1)) {
            System.out.println("The stack is full.");
        } else {
            stack[++topOfStack] = item;
        }
    }

    //pop an item out of the stack
    int pop() {
        if (topOfStack < 0) {
            System.out.println("The stack underflow.");
            return 0;
        } else {
            return stack[topOfStack--];
        }
    }
}

class StackDemo {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

        //push some numbers onto the stack
        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        //pop items out of the stack
        System.out.println("Stack in myStack1 ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());;
        }
        System.out.println("Stack in myStack2 ");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());;
        }
    }
}
