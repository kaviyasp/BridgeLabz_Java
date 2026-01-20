/*An athlete runs in a triangular park with sides provided as input by the user in meters.
If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
*/

package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class AthleteRounds {

    // Method to calculate number of rounds for 5 km
    static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;   // Perimeter of triangular park
        return 5000 / perimeter;        // Total rounds required
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the three sides of the park
        System.out.println("Enter side 1:");
        double s1 = input.nextDouble();

        System.out.println("Enter side 2:");
        double s2 = input.nextDouble();

        System.out.println("Enter side 3:");
        double s3 = input.nextDouble();

        // Call method to calculate rounds
        double rounds = calculateRounds(s1, s2, s3);

        // Display result
        System.out.println("The number of rounds required is " + rounds);
    }
}
