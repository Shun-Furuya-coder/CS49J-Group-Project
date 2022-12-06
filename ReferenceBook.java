package LibraryManagementSystem;

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
	   public void borrowBook(Borrower borrower) {
	       System.out.println("Reference book cannot be borrowed.");
	   }

	   @Override
	   public void returnBook(Borrower borrower) {
	       System.out.println("Reference book cannot be returned.");
	   }
	}