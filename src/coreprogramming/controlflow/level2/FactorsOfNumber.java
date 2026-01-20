/* Create a program to find the factors of a number taken as user input.
Hint =>
Get the input value for a variable named number and check if it is a positive integer.
Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.
*/

package CoreProgramming.ControlFlow.Level2;
import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {
            System.out.println("Factors of " + number + " are: ");

            // Loop to find and print factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            // Handle invalid input
            System.out.println("Not a positive integer");
        }
    }
}
