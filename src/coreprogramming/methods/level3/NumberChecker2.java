/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array.
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
*/

package CoreProgramming.Methods.Level3;

import java.util.Scanner;

class NumberChecker2 {

    // Counts number of digits in the given number
    static int countDigits(int n) {
        int c = 0;
        while (n != 0) {        // Loop until number becomes 0
            c++;
            n /= 10;
        }
        return c;
    }

    // Stores digits of the number into an array
    static int[] getDigits(int n) {
        int[] digits = new int[countDigits(n)];
        int index = 0;

        // Loop to extract digits from the number
        while (n != 0) {
            digits[index] = n % 10;
            index++;
            n /= 10;
        }
        return digits;
    }

    // Finds sum of digits using the digits array
    static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {     // Loop to add digits
            sum += d;
        }
        return sum;
    }

    // Finds sum of squares of digits
    static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int d : digits) {     // Loop to add square of each digit
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Checks whether the number is a Harshad number
    static boolean isHarshad(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    // Finds frequency of each digit in the number
    static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        // Count frequency of digits
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get digits of the number
        int[] digits = getDigits(number);

        // Display sum, sum of squares, and Harshad check
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, digits));

        // Display digit frequencies
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {   // Loop to print frequency
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " times");
            }
        }
    }
}
