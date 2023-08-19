package tutorials.tutorials15_collections.list;

import java.util.LinkedList;

/**
 * LinkedList is a generic class that extends AbstractSequentialList and implements the List, Deque, and Queue interfaces.
 */

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        System.out.println("Initial size of intLinkedList: " + intLinkedList.size());

        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(1);
        intLinkedList.add(6,6);
        System.out.println("Content of intLinkedList after addition: " + intLinkedList);

        intLinkedList.addFirst(0);
        intLinkedList.addLast(7);
        System.out.println("Content of intLinkedList after addition: " + intLinkedList);

        intLinkedList.removeFirst();
        System.out.println("Content of intLinkedList after removeFirst: " + intLinkedList);

        intLinkedList.removeLast();
        System.out.println("Content of intLinkedList after removeLast: " + intLinkedList);


        intLinkedList.clear();
        System.out.println("Content of intLinkedList after clear: " + intLinkedList);
    }
}
