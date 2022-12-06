import java.util.*;

/*
 * Able to represent Queue with storing the list of 
 * FictionBook, NonFictionBook, ReferenceBook, TextBook.
 */
public class queueBook {
    public static void main(String[] args) {
        
        // Scanner method 
        Scanner scan = new Scanner(System.in);
        Queue<String> category = new LinkedList<Integer>();

        // User input
        System.out.println("Category to Choose: FictionBook, NonFictionBook, ReferenceBook, TextBook");
        System.out.println("Enter the Category of the Book to Store: ");
        String input;

        while (scan.hasNextLine() && (input = scan.nextLine()).length() != 0) {
            category.add(input);
        }

        System.out.printf("Category Queue: %s%n", category);
    }
}