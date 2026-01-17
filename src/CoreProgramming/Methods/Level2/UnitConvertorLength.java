/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertYardsToFeet(double yards) =>
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class UnitConvertorLength {

    // Converts yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Converts feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Converts meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Converts inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Converts inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {

        // Scanner object to read input values
        Scanner input = new Scanner(System.in);

        // Read yards value and convert to feet
        System.out.println("Enter yards:");
        double yards = input.nextDouble();
        System.out.println("Feet: " + convertYardsToFeet(yards));

        // Read inches value and convert to centimeters
        System.out.println("Enter inches:");
        double inches = input.nextDouble();
        System.out.println("Centimeters: " + convertInchesToCentimeters(inches));
    }
}
