/*
Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint =>
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/

package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Count number of digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count]; // Array to store digits
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            digits[index++] = number % 10;
            number = number / 10;
        }

        int[] frequency = new int[10]; // Frequency array for digits 0–9

        // Calculate frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display digit frequencies
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
