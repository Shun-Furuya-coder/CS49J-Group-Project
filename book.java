package LibraryManagementSystem;

//Abstract class Book
public abstract class Book {

   private String bookName;
   private String author;
   private int numOfCopies;

   public Book(String bookName, String author, int numOfCopies) {
       this.bookName = bookName;
       this.author = author;
       this.numOfCopies = numOfCopies;
   }

   public String getBookName() {
       return bookName;
   }

   public String getAuthor() {
       return author;
   }

   public int getNumOfCopies() {
       return numOfCopies;
   }

   public void setNumOfCopies(int numOfCopies) {
       this.numOfCopies = numOfCopies;
   }

   public abstract void borrowBook();
   public abstract void returnBook();
}

//Concrete class 1
public class FictionBook extends Book {

   private String genre;

   public FictionBook(String bookName, String author, int numOfCopies, String genre) {
       super(bookName, author, numOfCopies);
       this.genre = genre;
   }

   public String getGenre() {
       return genre;
   }

   @Override
   public void borrowBook() {
       int numOfCopies = super.getNumOfCopies();
       if (numOfCopies > 0) {
           System.out.println("Fiction book borrowed.");
           super.setNumOfCopies(numOfCopies - 1);
       } else {
           System.out.println("Fiction book not available.");
       }
   }

   @Override
   public void returnBook() {
       int numOfCopies = super.getNumOfCopies();
       System.out.println("Fiction book returned.");
       super.setNumOfCopies(numOfCopies + 1);
   }
}

//Concrete class 2
public class NonFictionBook extends Book {

   private String topic;

   public NonFictionBook(String bookName, String author, int numOfCopies, String topic) {
       super(bookName, author, numOfCopies);
       this.topic = topic;
   }

   public String getTopic() {
       return topic;
   }

   @Override
   public void borrowBook() {
       int numOfCopies = super.getNumOfCopies();
       if (numOfCopies > 0) {
           System.out.println("Non-Fiction book borrowed.");
           super.setNumOfCopies(numOfCopies - 1);
       } else {
           System.out.println("Non-Fiction book not available.");
       }
   }

   @Override
   public void returnBook() {
       int numOfCopies = super.getNumOfCopies();
       System.out.println("Non-Fiction book returned.");
       super.setNumOfCopies(numOfCopies + 1);
   }
}

//Concrete class 3
public class ReferenceBook extends Book {

   private String referenceType;

   public ReferenceBook(String bookName, String author, int numOfCopies, String referenceType) {
       super(bookName, author, numOfCopies);
       this.referenceType = referenceType;
   }

   public String getReferenceType() {
       return referenceType;
   }

   @Override
   public void borrowBook() {
       System.out.println("Reference book cannot be borrowed.");
   }

   @Override
   public void returnBook() {
       System.out.println("Reference book cannot be returned.");
   }
}

//Concrete class 4
public class TextBook extends Book {

   private String subject;

   public TextBook(String bookName, String author, int numOfCopies, String subject) {
       super(bookName, author, numOfCopies);
       this.subject = subject;
   }

   public String getSubject() {
       return subject;
   }

   @Override
   public void borrowBook() {
       int numOfCopies = super.getNumOfCopies();
       if (numOfCopies > 0) {
           System.out.println("Text book borrowed.");
           super.setNumOfCopies(numOfCopies - 1);
       } else {
           System.out.println("Text book not available.");
       }
   }

   @Override
   public void returnBook() {
       int numOfCopies = super.getNumOfCopies();
       System.out.println("Text book returned.");
       super.setNumOfCopies(numOfCopies + 1);
   }
}

//Interface class Borrower
public interface Borrower {

   void borrowBook(Book book);
   void returnBook(Book book);
   void searchByBookName(String bookName);
   void searchByAuthor(String author);
}

//Concrete class 1
public class Student implements Borrower {

   private String name;
   private HashMap<Book, Integer> borrowedBooks;

   public Student(String name) {
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

//Concrete class 2
public class Teacher implements Borrower {

   private String name;
   private HashMap<Book, Integer> borrowedBooks;

   public Teacher(String name) {
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

//Concrete class 4
public class Visitor implements Borrower {

   private String name;
   private HashMap<Book, Integer> borrowedBooks;

   public Visitor(String name) {
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
