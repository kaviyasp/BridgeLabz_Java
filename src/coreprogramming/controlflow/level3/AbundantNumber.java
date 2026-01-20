/* Create a program to check if a number is an Abundant Number.
Hint =>
An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
Divisor of 12: 1, 2, 3, 4, 6
Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Run a for loop from i = 1 to i < number.
Inside the loop, check if number is divisible by i.
If true, add i to sum.
Outside the loop Check if sum is greater than number.
If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.
*/

package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

class AbundantNumber {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int sum = 0; // Variable to store sum of divisors

        // Find sum of all proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check whether the number is abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }
    }
}
