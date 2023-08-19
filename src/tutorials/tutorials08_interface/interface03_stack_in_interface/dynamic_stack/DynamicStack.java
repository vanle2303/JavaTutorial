package tutorials.tutorials08_interface.interface03_stack_in_interface.dynamic_stack;

interface IntStack {
    void push(int item);
    int pop();
}
public class DynamicStack implements IntStack {
    private int[] stack;
    private int topOfStack;

    DynamicStack(int size) {
        stack = new int[size];
        topOfStack = -1;
    }

    public void push(int item) {
        if (topOfStack == stack.length-1) {
            System.out.println("The stack is full.");
        } else {
            stack[++topOfStack] = item;
        }
    }

    public int pop() {
        if (topOfStack == 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stack[topOfStack--];
        }
    }
}

class TestStack {
    public static void main(String[] args) {
        DynamicStack stack1 = new DynamicStack(5);
        DynamicStack stack2 = new DynamicStack(8);

        for (int i = 0; i < 12; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            stack2.push(i);
        }

        System.out.println("Stack in stack1:");
        for (int i = 0; i < 12; i++) {
            System.out.println(stack1.pop());
        }
        System.out.println("Stack in stack2:");
        for (int i = 0; i < 20; i++) {
            System.out.println(stack2.pop());
        }
    }
}