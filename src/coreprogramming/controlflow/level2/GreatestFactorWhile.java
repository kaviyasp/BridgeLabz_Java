package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("Greatest factor of " + number + " is: ");

            int i = number - 1; // Start checking from number-1

            // Find the greatest factor using while loop
            while (i >= 1) {
                if (number % i == 0) {
                    System.out.println(i);
                    break; // Stop after finding the greatest factor
                }
                i--;
            }
        } else {
            // Handle invalid input
            System.out.println("Not a positive integer");
        }
    }
}
