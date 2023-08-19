package tutorials.tutorials15_collections.list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class demos casting, which is to cast (chuyen doi) a provider(right side) into a target-type
 * of the target(left side).
 * For example: Here bufferedReader.read() returns int type, we are casting an int provider into type char
 * and then assign it to a char var.
 *      char c = (char) bufferedReader.read();
 *
 * Note: There are two situations, one we need to use cast explicitly and another one we don't need to use cast
 *      1. Use cast explicitly when there're possible exceptions between the provider and the target
 *         eg. when we cast parent type to child type
 *      2. But when casting child type to parent type, we can just simply use the concept of a superclass
 *      reference refers to a subclass obj
 * More details in the program below
 */

class Person {
    int id;
}

public class CastingDemo {
    //This method returns an object of type parent Queue.
    //In fact, it returns a child object of type LinkedList.
    //The declaration of return type Queue hides all the methods that do not belong to Queue
    static Queue<Person> getQueue() {
        return new LinkedList<>();
    }

    static LinkedList<Person> getLinkedList() {
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        LinkedList<Person> linkedList;
        Queue<Person> queue = getQueue();
        //Here we cast a parent obj to a child obj. There is a possibility of casting exception
        //if the real type of `queue` is not LinkedList, therefore Java enforces the requirement of casting
        //here so that programmers are aware of the risk of casting exception
        //Note that all of these lines can be replaced with just one single line as follow:
        //LinkedList<Person> linkedList = (LinkedList<Person>) getQueue();
        linkedList = (LinkedList<Person>) queue;
        linkedList.addFirst(new Person());

        //Here we assign an obj of type child to a reference of type parent.
        //This assignment simply hides the methods of LinkedList that are not declared in Queue.
        //Therefore, there are no probs with that and NO casting is required.
        //All the following lines can be replaced with just one single line as follow:
        //Queue<Person> queueTest = getLinkedList();
        linkedList = getLinkedList();
        Queue<Person> queueTest;
        queueTest = linkedList;
        queueTest.clear();


    }
}
