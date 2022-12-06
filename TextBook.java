package LibraryManagementSystem;

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
 public void borrowBook(Borrower borrower) {
     int numOfCopies = super.getNumOfCopies();
     if (numOfCopies > 0) {
         System.out.println("Text book borrowed by " + borrower.getName());
         borrower.borrowBook(this);
         super.setNumOfCopies(numOfCopies - 1);
     } else {
         System.out.println("Text book not available.");
     }
 }

 @Override
 public void returnBook(Borrower borrower) {
     int numOfCopies = super.getNumOfCopies();
     System.out.println("Text book returned by " + borrower.getName());
     borrower.returnBook(this);
     super.setNumOfCopies(numOfCopies + 1);
 }
}
