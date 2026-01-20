/*
Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint =>
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array.
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class FactorOperations {

    // Method to find and return all factors of the number
    static int[] findFactors(int number) {
        int count = 0;

        // Count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find sum of factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to find product of factors
    static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method to find sum of squares of factors
    static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Get factors using method
        int[] factors = findFactors(number);

        // Display factors
        System.out.println("Factors:");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Display computed results
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
    }
}
