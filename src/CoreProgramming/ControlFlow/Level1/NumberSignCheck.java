/* Write a program to check whether a number is positive, negative, or zero.
Hint =>
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero.
*/

package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

class NumberSignCheck {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Check whether number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
