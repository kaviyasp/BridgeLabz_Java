/* Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint =>
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number
*/

package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class OddEvenCheck {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number >= 1) {

            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }

        } else {
            // Handle invalid input
            System.out.println("The number is not a natural number");
        }
    }
}
