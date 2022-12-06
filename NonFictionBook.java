package LibraryManagementSystem;

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
	   public void borrowBook(Borrower borrower) {
	       int numOfCopies = super.getNumOfCopies();
	       if (numOfCopies > 0) {
	           System.out.println("Non-Fiction book borrowed by " + borrower.getName());
	           borrower.borrowBook(this);
	           super.setNumOfCopies(numOfCopies - 1);
	       } else {
	           System.out.println("Non-Fiction book not available.");
	       }
	   }

	   @Override
	   public void returnBook(Borrower borrower) {
	       int numOfCopies = super.getNumOfCopies();
	       System.out.println("Non-Fiction book returned by " + borrower.getName());
	       borrower.returnBook(this);
	       super.setNumOfCopies(numOfCopies + 1);
	   }
	}