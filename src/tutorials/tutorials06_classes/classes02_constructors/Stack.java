package tutorials.tutorials06_classes.classes02_constructors;

/**
 * This class defines a stack that holds up to 10 integers
 * stack is a data structure that the first item pushed into the stack is the last one taken out of the stack
 * it is also called FILO standing for first in, last out
 * stack consists of 2 methods: push and pop
 * push is to push an item onto the stack and this method doesnt return anything
 * pop is to remove an item out of the stack and then return that item
 */
public class Stack {
    private int[] stck = new int[10];
    private int tos; //top of stack

    //initialize the value of tos
    Stack(){
        tos = -1;
    }

    /**
     * push the item onto the stack
     * we use tos to keep track of the index of the top item of the stack (the last item pushed onto the stack)
     * which is the first item pushed into the stack
     */
    void push(int item) {
        if (tos == 9) {
            System.out.println("The stack is full.");
        } else {
            stck[++tos] = item; //increment tos and then use that new val as index to insert the new item onto the stack
        }
    }

    /**
     * pop an item out of the stack and then return that item
     * after removing the element, we need to decrement the tos
     */
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stck[tos--]; //get the item at tos and then decrement(decrease by 1)
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

       /* myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());*/


        //push some number into the stack
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }

        //pop some numbers of the stack out
        for (int i = 0; i < 20; i++) {
            System.out.println(myStack.pop());
        }
    }

}

