/* Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class PoundsToKilograms {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read weight in pounds
        System.out.println("Enter the weight in pounds:");
        double pounds = input.nextDouble();

        // Convert pounds to kilograms
        double kilograms = pounds / 2.2;

        // Display the converted weight
        System.out.println(
                "The weight of the person in pound is " + pounds +
                        " and in kg is " + kilograms
        );
    }
}
