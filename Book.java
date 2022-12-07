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
 /**
   * Gets the name of the book
   *
   * @return the book name
  **/

 public String getBookName() {
     return bookName;
 }
/**
 * Gets the name of the author
 *
 *@return the author of the book
**/
 public String getAuthor() {
     return author;
 }
 /**
 * Gets the number of copies
 *
 * @return the number of copies
 **/

 public int getNumOfCopies() {
     return numOfCopies;
 }
 
 /**
 *Sets the number of copies
 *
 * @param numOfCopies the number of copies
 *
 **/
 public void setNumOfCopies(int numOfCopies) {
     this.numOfCopies = numOfCopies;
 }
 

 public abstract void borrowBook(Borrower borrower);
 public abstract void returnBook(Borrower borrower);


}
