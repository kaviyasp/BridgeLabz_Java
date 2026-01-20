/*
Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
Hint =>
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
Compare the two results and print the result
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class SumNaturalRecursive {

    // Method to calculate sum using recursion
    static int recursiveSum(int n) {
        if (n == 0) return 0;              // Base condition
        return n + recursiveSum(n - 1);    // Recursive call
    }

    // Method to calculate sum using formula
    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Read user input
        System.out.println("Enter a natural number:");
        int n = input.nextInt();

        // Check whether the number is a natural number
        if (n < 0) {
            System.out.println("Not a natural number");
            return;
        }

        // Calculate sum using both methods
        int sum1 = recursiveSum(n);
        int sum2 = formulaSum(n);

        // Print both results
        System.out.println("Recursive Sum: " + sum1);
        System.out.println("Formula Sum: " + sum2);
    }
}
