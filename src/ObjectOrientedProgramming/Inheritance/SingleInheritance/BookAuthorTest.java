package ObjectOrientedProgramming.Inheritance.SingleInheritance;

/*
Single Inheritance
Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
*/

// Superclass Book
class Book {
    String title;
    int publicationYear;

    // Constructor to initialize book details
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// Subclass Author extending Book
class Author extends Book {
    String name;
    String bio;

    // Constructor to initialize book and author details
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // calling Book constructor
        this.name = name;
        this.bio = bio;
    }

    // Method to display book and author information
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class BookAuthorTest {
    public static void main(String[] args) {

        // Creating Author object (single inheritance)
        Author author = new Author(
                "Java Basics",
                2023,
                "John Doe",
                "Software Developer and Java Trainer"
        );

        // Displaying information
        author.displayInfo();
    }
}
