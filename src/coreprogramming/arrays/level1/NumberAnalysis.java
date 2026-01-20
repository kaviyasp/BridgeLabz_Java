/* Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint =>
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero.
Finally compare the first and last element of the array and display if they equal, greater or less
*/

package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

class NumberAnalysis {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5]; // Array to store 5 numbers

        // Read 5 numbers into the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println("The number is zero");
            }
        }

        // Compare first and last elements
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}
