/* Rewrite the above program 7 to find the factors of a number using the while loop
Hint =>
Get the input value for a variable named number and check if it is a positive integer.
Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.
*/

package CoreProgramming.ControlFlow.Level2;
import java.util.Scanner;

class FactorsWhile {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {
            int i = 1; // Counter variable

            System.out.println("Factors of " + number + " are: ");

            // Find factors using while loop
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            // Handle invalid input
            System.out.println("Not a positive integer");
        }
    }
}
