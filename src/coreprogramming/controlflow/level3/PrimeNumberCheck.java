/*Write a Program to check if the given number is a prime number or not
Hint =>
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number.
Use the isPrime boolean variable to store the result
*/

package CoreProgramming.ControlFlow.Level3;
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true; // Variable to store prime check result

        // Prime check is valid only for numbers greater than 1
        if (n > 1) {

            // Check divisibility from 2 to n-1
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // Exit loop if divisible
                }
            }

        } else {
            isPrime = false;
        }

        // Display the result
        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}
