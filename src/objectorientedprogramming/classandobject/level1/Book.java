/*
Program: Program to Handle Book Details

Problem Statement:
Write a program to create a Book class with attributes title, author, and price.
Add a method to display the book details.
*/

package objectorientedprogramming.classandobject.level1;

import java.util.Scanner;

class Book {

    // Book attributes
    String title;
    String author;
    double price;

    // Method to display book details
    void displayBookDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Book object
        Book book = new Book();

        // Take input from user
        System.out.print("Enter Book Title: ");
        book.title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        book.author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        book.price = sc.nextDouble();

        // Display book details
        book.displayBookDetails();

        sc.close();
    }
}
