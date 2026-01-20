/* Create a program to find all the multiples of a number taken as user input below 100.
Hint =>
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number. If true, print the number and continue the loop.
*/

package CoreProgramming.ControlFlow.Level2;
import java.util.Scanner;

class MultiplesFor {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Check if number is valid (positive and less than 100)
        if (number > 0 && number < 100) {
            System.out.println("Multiples:");

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            // Handle invalid input
            System.out.println("Invalid input");
        }
    }
}
