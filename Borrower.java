package LibraryManagementSystem;

public interface Borrower {

	   public void borrowBook(Book book);
	   public void returnBook(Book book);
	   public void searchByBookName(String bookName);
	   public void searchByAuthor(String author);
	   public String getName();
	}