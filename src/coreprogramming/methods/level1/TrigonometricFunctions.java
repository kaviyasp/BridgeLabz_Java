/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint =>
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class TrigonometricFunctions {

    // Method to calculate sin, cos and tan values
    static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians
        double sin = Math.sin(radians);         // Sine value
        double cos = Math.cos(radians);         // Cosine value
        double tan = Math.tan(radians);         // Tangent value
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read angle in degrees
        System.out.println("Enter angle in degrees:");
        double angle = input.nextDouble();

        // Call method to calculate trigonometric values
        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sin value is " + result[0]);
        System.out.println("Cos value is " + result[1]);
        System.out.println("Tan value is " + result[2]);
    }
}