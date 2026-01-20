/*
Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop.
Here we increase the size of the array by 10 to store all digits and then find the largest and second-largest digit
*/

package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

class LargestSecondLargestDynamic {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read the number
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and dynamically resize array if needed
        while (number != 0) {

            // Increase array size when index reaches maxDigit
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                // Copy old digits to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            // Store digit and remove last digit from number
            digits[index++] = number % 10;
            number = number / 10;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest digit is " + largest);
        System.out.println("Second largest digit is " + secondLargest);
    }
}
