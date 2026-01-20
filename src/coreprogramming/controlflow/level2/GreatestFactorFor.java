/* Create a program to print the greatest factor of a number beside itself using a loop.
Hint =>
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
*/

package CoreProgramming.ControlFlow.Level2;
import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("Greatest factor of " + number + " is: ");

            // Loop from number-1 down to 1 to find greatest factor
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    System.out.println(i);
                    break; // Stop after finding the greatest factor
                }
            }
        } else {
            // Handle invalid input
            System.out.println("Not a positive integer");
        }
    }
}
