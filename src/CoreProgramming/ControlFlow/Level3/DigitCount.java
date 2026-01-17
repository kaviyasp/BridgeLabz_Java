/*Create a program to count the number of digits in an integer.
Hint =>
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
*/

package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

class DigitCount {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int count = 0; // Variable to count digits

        // Special case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Loop to remove digits one by one
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        // Display the digit count
        System.out.println("The number of digits is " + count);
    }
}
