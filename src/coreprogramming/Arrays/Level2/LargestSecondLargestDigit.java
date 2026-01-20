/*Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint =>
Create a number variable and Take user input.
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number
*/

package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int maxdigit = 10;
        int[] digit = new int[maxdigit];
        int index = 0;

        // Extract digits and store in array
        while (n != 0 && index < maxdigit) {
            digit[index] = n % 10;
            n = n / 10;
            index++;
        }

        int largest = 0;
        int secondlargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digit[i] > largest) {
                secondlargest = largest;
                largest = digit[i];
            } else if (digit[i] > secondlargest && digit[i] != largest) {
                secondlargest = digit[i];
            }
        }

        // Display result
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secondlargest);
    }
}
