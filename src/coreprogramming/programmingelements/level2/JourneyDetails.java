/* Rewrite the Sample Program 2 with user inputs
Hint =>
Create variables and take user inputs for name, fromCity, viaCity, toCity
Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
Create Variables and take time taken
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class JourneyDetails {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read personal and journey details
        System.out.println("Enter your name:");
        String name = input.next();

        System.out.println("Enter from city:");
        String fromCity = input.next();

        System.out.println("Enter via city:");
        String viaCity = input.next();

        System.out.println("Enter to city:");
        String toCity = input.next();

        // Read distances and time taken
        System.out.println("Enter distance from source to via city (in miles):");
        double fromToVia = input.nextDouble();

        System.out.println("Enter distance from via city to destination (in miles):");
        double viaToFinalCity = input.nextDouble();

        System.out.println("Enter time taken (in hours):");
        double time = input.nextDouble();

        // Calculate total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / time;

        // Display journey summary
        System.out.println(
                name + " travelled from " + fromCity + " to " + toCity +
                        " via " + viaCity + ". Total distance is " + totalDistance +
                        " miles and average speed is " + speed + " miles per hour"
        );
    }
}
