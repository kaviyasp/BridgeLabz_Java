/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow()
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
*/

package CoreProgramming.Methods.Level3;

import java.util.Scanner;

class NumberChecker5 {

    // Finds all factors of a number and stores them in an array
    static int[] findFactors(int number) {
        int count = 0;

        // Loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Loop to store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Finds the greatest factor
    static int greatestFactor(int[] factors) {
        int max = factors[0];

        // Loop to find maximum factor
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }

    // Finds sum of all factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;

        // Loop to add all factors
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Finds product of all factors
    static long productOfFactors(int[] factors) {
        long product = 1;

        // Loop to multiply all factors
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Finds product of cubes of all factors
    static double productOfCubes(int[] factors) {
        double product = 1;

        // Loop to multiply cube of each factor
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Checks whether the number is a perfect number
    static boolean isPerfect(int number) {
        int sum = 0;

        // Loop to calculate sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Checks whether the number is an abundant number
    static boolean isAbundant(int number) {
        int sum = 0;

        // Loop to calculate sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    // Checks whether the number is a deficient number
    static boolean isDeficient(int number) {
        int sum = 0;

        // Loop to calculate sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    // Finds factorial of a digit
    static int factorial(int digit) {
        int fact = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Checks whether the number is a strong number
    static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        // Loop to extract digits and add factorials
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Display results of all operations
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));

        System.out.println("Perfect Number: " + isPerfect(number));
        System.out.println("Abundant Number: " + isAbundant(number));
        System.out.println("Deficient Number: " + isDeficient(number));
        System.out.println("Strong Number: " + isStrong(number));
    }
}
