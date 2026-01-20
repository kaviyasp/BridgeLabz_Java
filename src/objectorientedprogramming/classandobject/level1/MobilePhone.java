/*
Program: Program to Handle Mobile Phone Details

Problem Statement:
Create a MobilePhone class with attributes brand, model, and price.
Add a method to display all the details of the phone.
*/

package objectorientedprogramming.classandobject.level1;

import java.util.Scanner;

class MobilePhone {

    // Phone attributes
    String brand;
    String model;
    double price;

    // Method to display phone details
    void displayPhoneDetails() {
        System.out.println("\nMobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create MobilePhone object
        MobilePhone phone = new MobilePhone();

        // Take input
        System.out.print("Enter Mobile Brand: ");
        phone.brand = sc.nextLine();

        System.out.print("Enter Mobile Model: ");
        phone.model = sc.nextLine();

        System.out.print("Enter Mobile Price: ");
        phone.price = sc.nextDouble();

        // Display details
        phone.displayPhoneDetails();

        sc.close();
    }
}
