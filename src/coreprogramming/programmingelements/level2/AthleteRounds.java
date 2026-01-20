/* An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class AthleteRounds {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read the three sides of the triangular park
        System.out.println("Enter side 1 of the park in meters:");
        double side1 = input.nextDouble();

        System.out.println("Enter side 2 of the park in meters:");
        double side2 = input.nextDouble();

        System.out.println("Enter side 3 of the park in meters:");
        double side3 = input.nextDouble();

        // Calculate perimeter and number of rounds for 5 km
        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        // Display the total number of rounds
        System.out.println(
                "The total number of rounds the athlete will run is " + rounds + " to complete 5 km"
        );
    }
}
