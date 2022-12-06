package LibraryManagementSystem;

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
 public void borrowBook(Borrower borrower) {
     int numOfCopies = super.getNumOfCopies();
     if (numOfCopies > 0) {
         System.out.println("Fiction book borrowed by " + borrower.getName());
         borrower.borrowBook(this);
         super.setNumOfCopies(numOfCopies - 1);
     } else {
         System.out.println("Fiction book not available.");
     }
 }

 @Override
 public void returnBook(Borrower borrower) {
     int numOfCopies = super.getNumOfCopies();
     System.out.println("Fiction book returned by " + borrower.getName());
     borrower.returnBook(this);
     super.setNumOfCopies(numOfCopies + 1);
 }
}