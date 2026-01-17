/* Write a Program to find the factorial of an integer entered by the user.
Hint =>
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
*/

package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int fac = 1; // Initialize factorial value
        int i = 1;   // Loop counter

        // Calculate factorial using while loop
        while (i <= n) {
            fac *= i;
            i++;
        }

        // Display the factorial result
        System.out.println("Factorial of " + n + " is: " + fac);
    }
}
