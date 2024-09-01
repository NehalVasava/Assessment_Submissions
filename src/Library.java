import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book == null) {
            throw new IllegalArgumentException("Book not found.");
        }
        book.borrow();
    }

    public void returnBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book == null) {
            throw new IllegalArgumentException("Book not found.");
        }
        book.returnBook();
    }

    public List<Book> viewAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
