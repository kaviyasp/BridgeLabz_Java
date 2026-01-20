/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertFarhenheitToCelsius(double farhenheit) =>
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462;
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541;
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172;
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class UnitConvertorMisc {

    // Converts Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Converts Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converts pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Converts kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Converts gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Converts liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read Celsius value and convert to Fahrenheit
        System.out.println("Enter Celsius:");
        double c = input.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(c));

        // Read kilograms value and convert to pounds
        System.out.println("Enter kilograms:");
        double kg = input.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kg));
    }
}
