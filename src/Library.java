import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> bookCollection;

    public Library() {
        this.bookCollection = new HashMap<>();
    }

    public void addBook(Book book) {
        if (book != null && book.getIsbn() != null && !book.getIsbn().isEmpty()) {
            bookCollection.put(book.getIsbn(), book);
            System.out.println("SUCCESS: Book '" + book.getTitle() + "' added to the library.");
        } else {
            System.out.println("ERROR: Could not add book due to invalid data.");
        }
    }

    public Book findBookByIsbn(String isbn) {
        return bookCollection.get(isbn);
    }

    public void borrowBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            if (!book.isBorrowed()) {
                book.borrowBook();
                System.out.println("SUCCESS: You have borrowed '" + book.getTitle() + "'.");
            } else {
                System.out.println("INFO: Sorry, '" + book.getTitle() + "' is already borrowed.");
            }
        } else {
            System.out.println("ERROR: No book found with ISBN " + isbn + ".");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            if (book.isBorrowed()) {
                book.returnBook();
                System.out.println("SUCCESS: You have returned '" + book.getTitle() + "'.");
            } else {
                System.out.println("INFO: This book was not borrowed from this library.");
            }
        } else {
            System.out.println("ERROR: No book found with ISBN " + isbn + ".");
        }
    }

    public void displayAllBooks() {
        System.out.println("\n--- Library Inventory ---");
        if (bookCollection.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            // Using a stream to print each book's details
            bookCollection.values().forEach(System.out::println);
        }
        System.out.println("-------------------------\n");
    }


}
