/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number,
1 for positive number and 0 if number is zero
*/

package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class NumberCheck {

    // Method to check number sign
    static int checkNumber(int n) {
        if (n > 0) {
            return 1;     // Positive number
        } else if (n < 0) {
            return -1;    // Negative number
        } else {
            return 0;     // Zero
        }
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Call method to check number
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println("The number is positive");
        } else if (result == -1) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
