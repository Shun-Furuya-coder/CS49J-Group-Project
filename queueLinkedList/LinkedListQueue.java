package queueLinkedList;

/*  Class: LinkedListQueue
 *
 *      This code uses an implementation of the Queue using Linked List.
 *      Methods include enqueue, dequeue, front, and provides a display as well.
 *      As we know, Queue follows the idea of First in First Out.
 *      Hence, Book borrower who was 1st in line must return the book first.
 */

public class LinkedListQueue {
    private Node frontSide, rearSide;

    // represents the queue Size
    private int queueSize;

    // node for the Linked List
    private class Node {
        int data;
        Node next;
    }

    // Constructor -> starting frontSide and rearSide as null;
    // at the start, size is 0 hence, queue is empty
    public LinkedListQueue() {
        frontSide = null;
        rearSide = null;
        queueSize = 0;
    }


    // observe if queue is empty
    public boolean isEmpty() {
        return (queueSize == 0);
    }

    // Dequeue: Removes Book ID from the frontSide.
    public int dequeue() {
        int data = frontSide.data;
        frontSide = frontSide.next;

        if (isEmpty()) {
            rearSide = null;
        }
        // decrement
        queueSize--;

        System.out.println("Book ID " + data + " has been removed from the queue.");
        return data;
    }

    // Enqueue: Adds the data at the rearSide of the queue
    public void enqueue(int data) {
        Node oldrearSide = rearSide;
        rearSide = new Node();
        rearSide.data = data;
        rearSide.next = null;

        if (isEmpty()) {
            frontSide = rearSide;
        } else {
            oldrearSide.next = rearSide;
        }
        // increment
        queueSize++;

        System.out.println("Book ID: " + data + " has been added to the queue.");
    }

    //print frontSide and rearSide of the queue (FIFO)
    public void printfrontrearSide() {
        System.out.println("Front of the book ID:" + frontSide.data
                + " |" + " Rear of the book ID:" + rearSide.data);
        return;
    }
}