/* Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
*/

package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read base and height values
        System.out.println("Enter the base:");
        double base = input.nextDouble();

        System.out.println("Enter the height:");
        double height = input.nextDouble();

        // Calculate area in square centimeters and square inches
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);

        // Display the calculated areas
        System.out.println(
                "The area of the triangle in square centimeters is " + areaCm +
                        " and in square inches is " + areaInches
        );
    }
}
