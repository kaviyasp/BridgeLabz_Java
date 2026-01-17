/*
Write a program to take 2 numbers and print their quotient and reminder
Hint =>
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number
*/

package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class QuotientRemainder {

    // Method to find quotient and remainder
    static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Calculate quotient
        int remainder = number % divisor;  // Calculate remainder
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number and divisor
        System.out.println("Enter number:");
        int number = input.nextInt();

        System.out.println("Enter divisor:");
        int divisor = input.nextInt();

        // Call method to get quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display results
        System.out.println("Quotient is " + result[0]);
        System.out.println("Remainder is " + result[1]);
    }
}
