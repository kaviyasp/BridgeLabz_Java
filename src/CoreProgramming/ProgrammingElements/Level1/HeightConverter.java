/* Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

package CoreProgramming.ProgrammingElements.Level1;
import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read height in centimeters
        System.out.println("Enter the height in cm:");
        double heightCm = input.nextDouble();

        // Convert height from cm to inches and feet
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);

        // Display the converted height
        System.out.println(
                "Your Height in cm is " + heightCm +
                        " while in feet is " + feet +
                        " and inches is " + totalInches
        );
    }
}
