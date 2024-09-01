public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding Books
        Book javaBook = new Book("12345", "Java Programming", "John Doe", 2020);
        library.addBook(javaBook);
        library.addBook(new Book("67890", "Python Programming", "Jane Smith", 2021));

        // Viewing Available Books
        System.out.println("Available Books:");
        for (Book book : library.viewAvailableBooks()) {
            System.out.println(book);
        }

        // Borrowing a Book
        library.borrowBook("12345");
        System.out.println("\nAfter borrowing '" + javaBook.getTitle() + "':");
        for (Book book : library.viewAvailableBooks()) {
            System.out.println(book);
        }

        // Returning a Book
        library.returnBook("12345");
        System.out.println("\nAfter returning '" + javaBook.getTitle() + "':");
        for (Book book : library.viewAvailableBooks()) {
            System.out.println(book);
        }
    }
}
