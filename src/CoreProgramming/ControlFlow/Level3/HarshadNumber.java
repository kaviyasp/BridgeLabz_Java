/*Create a program to check if a number taken from the user is a Harshad Number.
Hint =>
A Harshad number is an integer which is divisible by the sum of its digits.
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
*/

package CoreProgramming.ControlFlow.Level3;
import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int sum = 0;        // Variable to store sum of digits
        int temp = number; // Temporary variable for digit extraction

        // Loop to calculate sum of digits
        while (temp != 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        // Check if number is divisible by sum of its digits
        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}
