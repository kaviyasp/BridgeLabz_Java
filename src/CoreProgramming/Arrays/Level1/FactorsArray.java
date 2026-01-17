/* Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
Hint =>
Take the input for a number
Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factors array of size maxFactor and index variable to reflect the index of the array.
To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then need factors array to store more elements
To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array
Finally, Display the factors of the number
*/

package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

class FactorsArray {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int maxSize = 10;                  // Initial array size
        int[] factors = new int[maxSize];  // Array to store factors
        int index = 0;                     // Index for factors array

        // Loop to find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                // Increase array size if limit is reached
                if (index == maxSize) {
                    maxSize = maxSize * 2;
                    int[] temp = new int[maxSize];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[index++] = i; // Store factor
            }
        }

        // Display all factors
        System.out.println("Factors of the number are:");
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }
    }
}
