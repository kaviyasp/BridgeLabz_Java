/*
Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint =>
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class NumberAnalysisMethods {

    // Method to check if the number is positive
    static boolean isPositive(int n) {
        return n >= 0;
    }

    // Method to check if the number is even
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if a > b, -1 if a < b, 0 if equal
    static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take input and analyze each number
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number:");
            numbers[i] = input.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        // Compare first and last elements of the array
        int result = compare(numbers[0], numbers[4]);

        if (result == 0) {
            System.out.println("First and last are equal");
        } else if (result == 1) {
            System.out.println("First is greater");
        } else {
            System.out.println("First is smaller");
        }
    }
}
