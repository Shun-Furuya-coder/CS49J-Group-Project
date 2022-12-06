package queueLinkedList;

/*
    Class: Main.java

    Testing out the queue efficiency
    without user input at first.
 */
public class Main {
    public static void main(String a[]){

        LinkedListQueue queue = new LinkedListQueue();

        // Try to implement the User Input -> Write Here


        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println(" Welcome to Queue System Book Borrow ");
        System.out.println("       and Book Return System        ");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        // Adding the Book ID
        queue.enqueue(1000001);
        queue.enqueue(1000002);

        // Check the Enqueue
        queue.printfrontrearSide();

        // Adding the Book ID
        queue.enqueue(1000003);

        // Erase the top Book ID
        queue.dequeue();

        queue.dequeue();
        queue.enqueue(1000009);
        queue.dequeue();

        // Print the final outcome of Queue
        queue.printfrontrearSide();
    }
}

/*
Outcome of the Produced Output:

~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~
 Welcome to Queue System Book Borrow
       and Book Return System
~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~
Book ID: 1000001 has been added to the queue.
Book ID: 1000002 has been added to the queue.
Front of the book ID:1000001 | Rear of the book ID:1000002
Book ID: 1000003 has been added to the queue.
Book ID 1000001 has been removed from the queue.
Book ID 1000002 has been removed from the queue.
Book ID: 1000009 has been added to the queue.
Book ID 1000003 has been removed from the queue.
Front of the book ID:1000009 | Rear of the book ID:1000009

Process finished with exit code 0

 */