/* Create a program to swap two numbers
Hint =>
Create a variable number1 and take user input.
Create a variable number2 and take user input.
Swap number1 and number2  and print the swapped output
I/P => number1, number2
O/P => The swapped numbers are  ___ and ___
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read two numbers from user
        System.out.println("Enter the first number:");
        int number1 = input.nextInt();

        System.out.println("Enter the second number:");
        int number2 = input.nextInt();

        // Swap the values using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display the swapped numbers
        System.out.println(
                "The swapped numbers are " + number1 + " and " + number2
        );
    }
}
