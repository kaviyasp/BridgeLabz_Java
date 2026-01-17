/*
Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint =>
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae
root1 of x = (-b + delta)/(2*a)
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x
root of x = -b/(2*a)
If delta is negative return empty array or nothing
Write a Method to find find the roots of a quadratic equation and return the roots
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class Quadratic {

    // Method to find roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, two real roots exist
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};

            // If delta is zero, one real root exists
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};

            // If delta is negative, no real roots
        } else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input values
        System.out.println("Enter a:");
        double a = input.nextDouble();

        System.out.println("Enter b:");
        double b = input.nextDouble();

        System.out.println("Enter c:");
        double c = input.nextDouble();

        // Finding roots
        double[] roots = findRoots(a, b, c);

        // Displaying results
        if (roots.length == 2) {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("No real roots");
        }
    }
}
