/* Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/

package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read two numbers from user
        System.out.println("Enter the first number:");
        int number1 = input.nextInt();

        System.out.println("Enter the second number:");
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the results
        System.out.println(
                "The Quotient is " + quotient +
                        " and Reminder is " + remainder +
                        " of two number " + number1 + " and " + number2
        );
    }
}
