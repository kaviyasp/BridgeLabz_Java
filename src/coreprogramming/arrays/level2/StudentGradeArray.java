/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths.
Compute the percentage and then calculate the grade
*/

package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

class StudentGradeArray {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read number of students
        System.out.println("Enter number of students:");
        int n = input.nextInt();

        // Arrays to store marks, percentage, and grade
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Physics marks for student " + (i + 1) + ":");
            double p = input.nextDouble();

            System.out.println("Enter Chemistry marks:");
            double c = input.nextDouble();

            System.out.println("Enter Maths marks:");
            double m = input.nextDouble();

            // Validate marks
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks, enter again");
                i--;
            } else {
                marks[i][0] = p;
                marks[i][1] = c;
                marks[i][2] = m;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        // Display student report
        System.out.println("\nStudent Report:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Student " + (i + 1) +
                            " | Physics: " + marks[i][0] +
                            " | Chemistry: " + marks[i][1] +
                            " | Maths: " + marks[i][2] +
                            " | Percentage: " + percentage[i] +
                            " | Grade: " + grade[i]
            );
        }
    }
}
