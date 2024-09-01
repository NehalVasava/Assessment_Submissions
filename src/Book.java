public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private final int year;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        if (!isAvailable) {
            throw new IllegalStateException("Book is not available for borrowing.");
        }
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}
