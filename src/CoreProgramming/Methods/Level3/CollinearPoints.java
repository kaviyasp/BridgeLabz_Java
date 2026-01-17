/*
Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling.
Hint =>
Take inputs for 3 points x1, y1, x2, y2, and x3, y3
Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and ac are equal.
slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x2)
slope AC = (y3 - y1)/(x3 - x1)
The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear if the area of the triangle formed by three points is 0.
area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
*/

package CoreProgramming.Methods.Level3;

import java.util.Scanner;

class CollinearPoints {

    // Checks collinearity using slope comparison method
    static boolean isCollinearBySlope(double x1, double y1,
                                      double x2, double y2,
                                      double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);   // Slope of AB
        double slopeBC = (y3 - y2) / (x3 - x2);   // Slope of BC
        double slopeAC = (y3 - y1) / (x3 - x1);   // Slope of AC

        // Points are collinear if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Checks collinearity using area of triangle method
    static boolean isCollinearByArea(double x1, double y1,
                                     double x2, double y2,
                                     double x3, double y3) {

        // Calculate area of triangle formed by three points
        double area = 0.5 * (x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2));

        // If area is zero, points are collinear
        return area == 0;
    }

    public static void main(String[] args) {

        // Scanner object to take input values
        Scanner sc = new Scanner(System.in);

        // Read coordinates of first point
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Read coordinates of second point
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Read coordinates of third point
        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check and display result using slope method
        System.out.println("Collinear using Slope Method: "
                + isCollinearBySlope(x1, y1, x2, y2, x3, y3));

        // Check and display result using area method
        System.out.println("Collinear using Area Method: "
                + isCollinearByArea(x1, y1, x2, y2, x3, y3));
    }
}
