/* Write a program to check for the natural number and write the sum of n natural numbers
Hint =>
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise
The number ___ is not a natural number
*/

package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number >= 1) {
            int sum = number * (number + 1) / 2; // Calculate sum using formula
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Handle non-natural number case
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
