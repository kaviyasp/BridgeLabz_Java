/*
Program: Program to Simulate a Shopping Cart

Problem Statement:
Create a CartItem class with attributes itemName, price, and quantity.
Add methods to:
1. Add an item to the cart.
2. Remove an item from the cart.
3. Display the total cost.
*/

package objectorientedprogramming.classandobject.level2;

import java.util.Scanner;

public class CartItem {

    String itemName;
    double price;
    int quantity;

    // Add item method
    void addItem(int qty) {
        quantity += qty;
        System.out.println("Item added to cart.");
    }

    // Remove item method
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Item removed from cart.");
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    // Display total cost
    void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Creating object
        CartItem item = new CartItem();

        // Taking input from user
        System.out.print("Enter item name: ");
        item.itemName = sc.nextLine();

        System.out.print("Enter item price: ");
        item.price = sc.nextDouble();

        System.out.print("Enter quantity to add: ");
        item.addItem(sc.nextInt());

        System.out.print("Enter quantity to remove: ");
        item.removeItem(sc.nextInt());

        item.displayTotalCost();
        sc.close();
    }
}
