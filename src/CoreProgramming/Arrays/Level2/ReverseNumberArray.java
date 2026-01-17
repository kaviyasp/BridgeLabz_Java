/*
Create a program to take a number as input and reverse the number.
Store the digits in an array and display them in reverse order
*/

package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

class ReverseNumberArray {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Count number of digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];
        int[] reverse = new int[count];

        // Store digits in reverse order
        for (int i = 0; i < count; i++) {
            reverse[i] = number % 10;
            number = number / 10;
        }

        // Store original order digits
        for (int i = 0; i < count; i++) {
            digits[i] = reverse[count - 1 - i];
        }

        // Display original number using array
        System.out.println("Original number:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        // Display reversed number using array
        System.out.println("\nReversed number:");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
    }
}
