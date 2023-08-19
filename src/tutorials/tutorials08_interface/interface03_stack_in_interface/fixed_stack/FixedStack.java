package tutorials.tutorials08_interface.interface03_stack_in_interface.fixed_stack;

interface IntStack {
    void push(int item);
    int pop();
}

public class FixedStack implements IntStack {
    private int[] stack;
    private int topOfStack;

    FixedStack(int size) {
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
        if (topOfStack < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stack[topOfStack--];
        }
    }
}

class TestStack {
    public static void main(String[] args) {
        FixedStack s = new FixedStack(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
