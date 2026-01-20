/* Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Simple Interest = Principal * Rate * Time / 100
*/

package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class SimpleInterest {

    // Method to calculate simple interest
    static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read principal, rate, and time
        System.out.println("Enter Principal:");
        double principal = input.nextDouble();

        System.out.println("Enter Rate:");
        double rate = input.nextDouble();

        System.out.println("Enter Time:");
        double time = input.nextDouble();

        // Call method to calculate SI
        double si = calculateSI(principal, rate, time);

        // Display result
        System.out.println(
                "The Simple Interest is " + si +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time
        );
    }
}
