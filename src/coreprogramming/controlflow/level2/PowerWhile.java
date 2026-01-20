/*Rewrite the above program to find the power of a number using a while loop.
Hint =>
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
Finally, print the result
*/

package CoreProgramming.ControlFlow.Level2;
import java.util.Scanner;

class PowerWhile {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read number and power values
        System.out.println("Enter the number:");
        int number = input.nextInt();

        System.out.println("Enter the power:");
        int power = input.nextInt();

        int result = 1;   // Variable to store result
        int counter = 0;  // Counter for loop

        // Calculate power using while loop
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Display the result
        System.out.println("The result is " + result);
    }
}
