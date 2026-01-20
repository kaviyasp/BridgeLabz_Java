package objectorientedprogramming.keywords;

/*
Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
1. Static:
○ A static variable libraryName shared across all books.
○ A static method displayLibraryName() to print the library name.
2. This:
○ Use this to initialize title, author, and isbn in the constructor.
3. Final:
○ Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
4. Instanceof:
○ Verify if an object is an instance of the Book class before displaying its details.
*/

class Book {

    // static variable shared by all Book objects
    static String libraryName = "Central Library";

    // instance variable for book title
    String title;

    // instance variable for author name
    String author;

    // final variable for unique ISBN number
    final int isbn;

    // constructor to initialize book details
    Book(String title, String author, int isbn) {

        // assigning values using this keyword
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // static method to display library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // method to display book details
    void display(Object obj) {

        // checking whether object is of Book class
        if (obj instanceof Book) {

            System.out.println("Book Title: " + title);
            System.out.println("Author Name: " + author);
            System.out.println("ISBN Number: " + isbn);
        }
    }

    public static void main(String[] args) {

        // creating Book object
        Book b1 = new Book("Java Basics", "James", 1234);

        // calling static method
        displayLibraryName();

        // displaying book details
        b1.display(b1);
    }
}
