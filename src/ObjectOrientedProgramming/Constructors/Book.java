/*
Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
*/

package ObjectOrientedProgramming.Constructors;
class Book {

    String title;
    String author;
    double price;

    // Default constructor: assigns default values to variables
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor: assigns values passed during object creation
    Book(String title, String author, double price) {
        this.title = title;   // this refers to current object variable
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " | " + author + " | Rs." + price);
    }

    public static void main(String[] args) {

        // Object created using default constructor
        Book b1 = new Book();

        // Object created using parameterized constructor
        Book b2 = new Book("Java Basics", "James", 450);

        // Calling method using object reference
        b1.display();
        b2.display();
    }
}
