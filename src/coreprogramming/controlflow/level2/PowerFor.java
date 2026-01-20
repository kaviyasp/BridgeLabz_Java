/*Create a program to find the power of a number.
Hint =>
Get integer input for two variables - number and power and check for positive integer
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
*/

package CoreProgramming.ControlFlow.Level2;
import java.util.Scanner;

class PowerFor {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read number and power values
        System.out.println("Enter the number:");
        int number = input.nextInt();

        System.out.println("Enter the power:");
        int power = input.nextInt();

        // Check if power is non-negative
        if (power >= 0) {
            int result = 1; // Initialize result

            // Calculate power using for loop
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Display the result
            System.out.println("The result is " + result);
        } else {
            // Handle invalid power
            System.out.println("Invalid power");
        }
    }
}
