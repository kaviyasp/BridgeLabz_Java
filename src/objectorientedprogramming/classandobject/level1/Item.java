/*
Program: Program to Track Inventory of Items

Problem Statement:
Create an Item class with attributes itemCode, itemName, and price.
Add a method to display item details and calculate the total cost for a given quantity.
*/

package objectorientedprogramming.classandobject.level1;

import java.util.Scanner;

class Item {

    // Item attributes
    int itemCode;
    String itemName;
    double price;

    // Method to display item details
    void displayItemDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Item object
        Item item = new Item();

        // Take input
        System.out.print("Enter Item Code: ");
        item.itemCode = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Item Name: ");
        item.itemName = sc.nextLine();

        System.out.print("Enter Item Price: ");
        item.price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Display details
        item.displayItemDetails();
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));

        sc.close();
    }
}