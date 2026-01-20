/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines

Hint =>
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
*/

package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read marks for three subjects
        System.out.println("Enter Physics marks:");
        double physics = input.nextDouble();

        System.out.println("Enter Chemistry marks:");
        double chemistry = input.nextDouble();

        System.out.println("Enter Maths marks:");
        double maths = input.nextDouble();

        // Calculate average marks
        double average = (physics + chemistry + maths) / 3;

        String grade;
        String remarks;

        // Determine grade and remarks based on average
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display average, grade, and remarks
        System.out.println("Average Mark: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
