/*
Write a program calculate the wind chill temperature given the temperature and wind speed
Hint =>
Write a method to calculate the wind chill temperature using the formula
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16
public double calculateWindChill(double temperature, double windSpeed)
*/
package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class WindChill {

    // Method to calculate wind chill temperature
    static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read temperature and wind speed
        System.out.println("Enter temperature:");
        double temp = input.nextDouble();

        System.out.println("Enter wind speed:");
        double windSpeed = input.nextDouble();

        // Call method to calculate wind chill
        double result = calculateWindChill(temp, windSpeed);

        // Display result
        System.out.println("Wind Chill Temperature is " + result);
    }
}