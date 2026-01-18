package ObjectOrientedProgramming.Encapsulation;

/*
5. Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/

// Interface to handle reservation functionality
interface Reservable {
    void reserveItem();           // method to reserve item
    boolean checkAvailability();  // method to check availability
}

// Abstract parent class
abstract class LibraryItem {

    // Private variables to protect data (Encapsulation)
    private int itemId;
    private String title;
    private String author;

    // Constructor to initialize values
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method - implemented by subclasses
    abstract int getLoanDuration();

    // Concrete method common for all items
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("--------------------------------");
    }
}

// Book class
class Book extends LibraryItem implements Reservable {

    // Availability status
    private boolean available = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    // Loan duration for books
    @Override
    int getLoanDuration() {
        return 14;
    }

    // Reserve the book
    public void reserveItem() {
        available = false;
    }

    // Check availability
    public boolean checkAvailability() {
        return available;
    }
}

// Magazine class
class Magazine extends LibraryItem {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    // Shorter loan duration
    @Override
    int getLoanDuration() {
        return 7;
    }
}

// DVD class
class DVD extends LibraryItem {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    // Very short loan duration
    @Override
    int getLoanDuration() {
        return 3;
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Using parent reference to store child objects (Polymorphism)
        LibraryItem[] items = {
                new Book(1, "Java Programming", "James"),
                new Magazine(2, "Tech World", "Editorial"),
                new DVD(3, "Java Tutorial", "Oracle")
        };

        // Loop to display details of all items
        for (LibraryItem item : items) {
            item.getItemDetails();
        }
    }
}
