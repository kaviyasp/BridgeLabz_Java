package objectorientedprogramming.constructors;

/*
Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
*/
class LibraryBook {

    String title;
    String author;
    double price;
    boolean available;

    // Constructor initializes book details
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // book is available initially
    }

    void borrowBook() {
        if (available) {
            available = false; // changes state of object
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {

        // Object represents one book in library
        LibraryBook book = new LibraryBook("OOP in Java", "Herbert", 500);

        // Method call using object
        book.borrowBook();
        book.borrowBook();
    }
}
