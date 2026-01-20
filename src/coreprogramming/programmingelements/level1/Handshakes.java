/* Create a program to find the maximum number of handshakes among N number of students.
Hint =>
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/

package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {

        // Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Read number of students
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes using formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println(
                "The maximum number of possible handshakes is " + handshakes
        );
    }
}
