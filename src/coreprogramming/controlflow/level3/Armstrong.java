/*Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
Hint =>
Armstrong Number is a number whose Sum of cubes of each digit results in the original number as in for e.g. 153 = 1^3 + 5^3 + 3^3
Get an integer input and store it in the number variable and define sum variable, initialize it to zero and originalNumber variable and assign it to input number variable
Use the while loop till the originalNumber is not equal to zero
In the while loop find each digit which is the reminder of the modulus operation number % 10. Find the cube of the number and add it to the sum variable
Again in while loop find the quotient of the number using the division operation number/10 and assign it to the original number. This removes the last digit of the original number.
Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly
*/

package CoreProgramming.ControlFlow.Level3;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the number and store original value
        System.out.println("Enter a number: ");
        int originalnum = sc.nextInt();
        int n = originalnum;

        int sum = 0; // Variable to store sum of cubes of digits

        // Loop to extract each digit and calculate cube
        while (n > 0) {
            int digit = n % 10;           // Get last digit
            int cube = digit * digit * digit;
            sum += cube;                 // Add cube to sum
            n = n / 10;                  // Remove last digit
        }

        // Check if sum equals original number
        if (originalnum == sum) {
            System.out.println(originalnum + " is an Armstrong");
        } else {
            System.out.println(originalnum + " is not an Armstrong");
        }
    }
}
