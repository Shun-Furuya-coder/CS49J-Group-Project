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

 public abstract void borrowBook(Borrower borrower);
 public abstract void returnBook(Borrower borrower);
}
