/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertKmToMiles(double km) =>
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class UnitConvertorDistance {

    // Converts kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Converts miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Converts meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Converts feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read kilometers and convert to miles
        System.out.println("Enter kilometers:");
        double km = input.nextDouble();
        System.out.println("Miles: " + convertKmToMiles(km));

        // Read meters and convert to feet
        System.out.println("Enter meters:");
        double meters = input.nextDouble();
        System.out.println("Feet: " + convertMetersToFeet(meters));
    }
}
