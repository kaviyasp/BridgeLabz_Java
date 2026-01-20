/*
Problem 2: Book Library System
Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
*/

package objectorientedprogramming.constructors.accessmodifiers;
class Book {

    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for private variable
    public String getAuthor() {
        return author;
    }

    // Setter for private variable
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass
class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayDetails() {
        // Accessing public and protected members
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-12345", "Java Programming", "James");
        ebook.displayDetails();
    }
}
