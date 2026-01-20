/* Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint =>
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;*/

package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class SumUntilNegative {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        double total = 0.0; // Variable to store sum

        // Infinite loop to keep reading values
        while (true) {
            System.out.println("Enter a number:");
            double value = input.nextDouble();

            // Break the loop if value is zero or negative
            if (value <= 0) {
                break;
            }

            total = total + value; // Add value to total
        }

        // Display the final sum
        System.out.println("The total sum is " + total);
    }
}
