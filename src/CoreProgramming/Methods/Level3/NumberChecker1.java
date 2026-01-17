/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array
Method to check if the number is a armstrong number using the digits array
Method to find the largest and second largest elements in the digits array
Method to find the the smallest and second smallest elements in the digits array
*/

package CoreProgramming.Methods.Level3;

import java.util.Scanner;

class NumberChecker1 {

    // Counts number of digits in the given number
    static int countDigits(int n) {
        int c = 0;
        while (n != 0) {     // Loop until number becomes 0
            c++;
            n /= 10;
        }
        return c;
    }

    // Stores digits of the number into an array
    static int[] getDigits(int n) {
        int[] d = new int[countDigits(n)];
        int i = 0;

        // Loop to extract digits
        while (n != 0) {
            d[i++] = n % 10;
            n /= 10;
        }
        return d;
    }

    // Checks whether the number is a duck number
    static boolean isDuck(int[] d) {
        for (int x : d) {          // Loop through digits
            if (x == 0) return true;
        }
        return false;
    }

    // Checks whether the number is an Armstrong number
    static boolean isArmstrong(int n, int[] d) {
        int sum = 0;
        int power = d.length;

        // Loop to calculate Armstrong sum
        for (int x : d) {
            sum += Math.pow(x, power);
        }
        return sum == n;
    }

    // Finds largest and second largest digits
    static int[] largestTwo(int[] d) {
        int max = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;

        // Loop to find largest and second largest
        for (int x : d) {
            if (x > max) {
                sec = max;
                max = x;
            } else if (x > sec && x != max) {
                sec = x;
            }
        }
        return new int[]{max, sec};
    }

    // Finds smallest and second smallest digits
    static int[] smallestTwo(int[] d) {
        int min = Integer.MAX_VALUE, sec = Integer.MAX_VALUE;

        // Loop to find smallest and second smallest
        for (int x : d) {
            if (x < min) {
                sec = min;
                min = x;
            } else if (x < sec && x != min) {
                sec = x;
            }
        }
        return new int[]{min, sec};
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get digits of the number
        int[] digits = getDigits(number);

        // Display duck and armstrong results
        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(number, digits));

        // Find largest and smallest digits
        int[] max = largestTwo(digits);
        int[] min = smallestTwo(digits);

        // Display results
        System.out.println("Largest: " + max[0] + " Second Largest: " + max[1]);
        System.out.println("Smallest: " + min[0] + " Second Smallest: " + min[1]);
    }
}
