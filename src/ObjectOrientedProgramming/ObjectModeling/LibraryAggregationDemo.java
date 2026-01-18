package ObjectOrientedProgramming.ObjectModeling;

import java.util.ArrayList;

/*
Problem 1: Library and Books (Aggregation)
● Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
● Tasks:
○ Define a Library class with an ArrayList of Book objects.
○ Define a Book class with attributes such as title and author.
○ Demonstrate the aggregation relationship by creating books and adding them to different libraries.
● Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
*/

class Book {
    String title;
    String author;

    // Constructor to initialize book details
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }
}

class Library {
    String libraryName;
    ArrayList<Book> books = new ArrayList<>();

    // Constructor to initialize library name
    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Method to add book to library
    void addBook(Book book) {
        books.add(book);
    }

    // Method to display library books
    void displayLibraryBooks() {
        System.out.println("Library: " + libraryName);
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class LibraryAggregationDemo {
    public static void main(String[] args) {

        // Creating book objects independently
        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("OOP Concepts", "Bjarne Stroustrup");

        // Creating library objects
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Adding books to libraries
        lib1.addBook(book1);
        lib2.addBook(book1); // Same book added to another library
        lib2.addBook(book2);

        // Display library details
        lib1.displayLibraryBooks();
        lib2.displayLibraryBooks();
    }
}
