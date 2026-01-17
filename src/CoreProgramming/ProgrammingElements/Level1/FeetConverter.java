/* Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

class FeetConverter {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Read distance in feet
        System.out.println("Enter the distance in feet:");
        double feet = input.nextDouble();

        // Convert feet to yards and miles
        double yards = feet / 3;
        double miles = yards / 1760;

        // Display the converted distances
        System.out.println(
                "The distance in yards is " + yards +
                        " and in miles is " + miles
        );
    }
}
