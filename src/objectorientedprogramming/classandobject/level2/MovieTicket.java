/*
Program: Program to Model a Movie Ticket Booking System

Problem Statement:
Create a MovieTicket class with attributes movieName, seatNumber, and price.
Add methods to:
1. Book a ticket.
2. Display ticket details.
*/

package objectorientedprogramming.classandobject.level2;

import java.util.Scanner;

public class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    // Book ticket method
    void bookTicket(int seat, double ticketPrice) {
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully.");
    }

    // Display ticket details
    void displayTicketDetails() {
        System.out.println("\nTicket Details:");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat No    : " + seatNumber);
        System.out.println("Price      : " + price);
    }

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Creating object
        MovieTicket ticket = new MovieTicket();

        // Taking input from user
        System.out.print("Enter movie name: ");
        ticket.movieName = sc.nextLine();

        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(seat, price);
        ticket.displayTicketDetails();

        sc.close();
    }
}
