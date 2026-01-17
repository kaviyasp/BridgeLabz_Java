/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed.
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
*/

package CoreProgramming.Methods.Level3;

import java.util.Scanner;

class NumberChecker4 {

    // Counts the number of digits in the given number
    static int countDigits(int number) {
        int count = 0;
        while (number != 0) {        // Loop until number becomes 0
            count++;
            number /= 10;
        }
        return count;
    }

    // Stores digits of the number into an array
    static int[] storeDigits(int number) {
        int[] digits = new int[countDigits(number)];
        int index = 0;

        // Loop to extract digits
        while (number != 0) {
            digits[index] = number % 10;
            index++;
            number /= 10;
        }
        return digits;
    }

    // Reverses the digits array
    static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];

        // Loop to reverse array elements
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Compares two arrays for equality
    static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;

        // Loop to compare each element
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Checks whether the number is a palindrome
    static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // Checks whether the number is a duck number
    static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {      // Loop to check presence of zero
            if (d == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store digits of the number
        int[] digits = storeDigits(number);

        // Display digits
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Display reversed digits
        int[] reversed = reverseDigits(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Display palindrome and duck number results
        System.out.println("Palindrome Number: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
}
