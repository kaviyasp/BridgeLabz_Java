/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to Check if a number is prime number.
Method to Check if a number is a neon number.
Method to Check if a number is a spy number.
Method to Check if a number is an automorphic number.
Method to Check if a number is a buzz number.
*/

package CoreProgramming.Methods.Level3;

import java.util.Scanner;

class NumberChecker3 {

    // Checks whether the number is a prime number
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        // Loop to check divisibility
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Checks whether the number is a neon number
    static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;

        // Loop to find sum of digits of square
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    // Checks whether the number is a spy number
    static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;

        // Loop to calculate sum and product of digits
        while (n != 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return sum == product;
    }

    // Checks whether the number is an automorphic number
    static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }

    // Checks whether the number is a buzz number
    static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Display results for all number checks
        System.out.println("Prime Number: " + isPrime(number));
        System.out.println("Neon Number: " + isNeon(number));
        System.out.println("Spy Number: " + isSpy(number));
        System.out.println("Automorphic Number: " + isAutomorphic(number));
        System.out.println("Buzz Number: " + isBuzz(number));
    }
}
