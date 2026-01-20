/* Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
*/

package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

class PurchasePrice {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read unit price and quantity
        System.out.println("Enter the unit price:");
        double unitPrice = input.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();

        // Calculate total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the total price
        System.out.println(
                "The total purchase price is INR " + totalPrice +
                        " if the quantity " + quantity +
                        " and unit price is INR " + unitPrice
        );
    }
}
