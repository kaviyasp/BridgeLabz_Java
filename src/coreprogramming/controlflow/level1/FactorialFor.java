/* Write a Program to find the factorial of an integer entered by the user.
Hint =>
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a For loop, compute the factorial.
Print the factorial at the end.
*/

package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number >= 1) {

            int factorial = 1; // Initialize factorial value

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            // Display the factorial result
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {
            // Handle invalid (non-natural) input
            System.out.println("The number is not a natural number");
        }
    }
}
