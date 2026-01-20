/* Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct.
Hint =>
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result
*/

package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

class NaturalNumberSumCheckWhile {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a natural number:");
        int n = input.nextInt();

        // Check if the number is a natural number
        if (n >= 1) {

            int sumFormula = n * (n + 1) / 2; // Sum using formula

            int sumWhile = 0;
            int i = 1;

            // Calculate sum using while loop
            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }

            // Display both results
            System.out.println("Sum using formula is " + sumFormula);
            System.out.println("Sum using while loop is " + sumWhile);

            // Compare both results
            if (sumFormula == sumWhile) {
                System.out.println("Both results are correct");
            } else {
                System.out.println("Results are not equal");
            }

        } else {
            // Handle invalid input
            System.out.println("The number is not a natural number");
        }
    }
}
