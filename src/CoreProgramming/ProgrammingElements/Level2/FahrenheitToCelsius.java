/*Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint =>
Create a fahrenheit variable and take the user's input
User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read temperature in Fahrenheit
        System.out.println("Enter temperature in fahrenheit:");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius using formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the converted temperature
        System.out.println(
                "The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius"
        );
    }
}
