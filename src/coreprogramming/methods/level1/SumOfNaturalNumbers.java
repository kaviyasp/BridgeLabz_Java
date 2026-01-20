/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop
*/

package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum of n natural numbers using loop
    public static int sumofn(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Call method and display result
        System.out.println("The sum of natural number is: " + sumofn(number));
    }
}
