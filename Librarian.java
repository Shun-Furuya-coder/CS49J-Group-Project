package LibraryManagementSystem;

//Concrete class 3
public class Librarian implements Borrower {

 private String name;
 private HashMap<Book, Integer> borrowedBooks;

 public Librarian(String name) {
     this.name = name;
     borrowedBooks = new HashMap<>();
 }

 public String getName() {
     return name;
 }

 @Override
 public void borrowBook(Book book) {
     int numOfCopies = book.getNumOfCopies();
     if (numOfCopies > 0) {
         System.out.println("Book borrowed by " + name);
         book.setNumOfCopies(numOfCopies - 1);
         borrowedBooks.put(book, 1);
     } else {
         System.out.println("Book not available for borrowing.");
     }
 }

 @Override
 public void returnBook(Book book) {
     int numOfCopies = book.getNumOfCopies();
     System.out.println("Book returned by " + name);
     book.setNumOfCopies(numOfCopies + 1);
     borrowedBooks.remove(book);
 }

 @Override
 public void searchByBookName(String bookName) {
     for (Book book : borrowedBooks.keySet()) {
         if (book.getBookName().equals(bookName)) {
             System.out.println(name + " has borrowed this book.");
         }
     }
 }

 @Override
 public void searchByAuthor(String author) {
     for (Book book : borrowedBooks.keySet()) {
         if (book.getAuthor().equals(author)) {
             System.out.println(name + " has borrowed this book.");
         }
     }
 }
}