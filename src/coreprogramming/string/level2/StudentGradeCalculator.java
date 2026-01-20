/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint =>
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format.
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class StudentGradeCalculator {

    // Generates random PCM scores for all students
    static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3];

        // Loop to generate Physics, Chemistry, and Maths marks
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    // Calculates total, average, and percentage for each student
    static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];

        // Loop to calculate results for each student
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            // Rounding values to 2 decimal places
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Calculates grade based on percentage
    static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        // Loop to assign grades for each student
        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];

            if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else if (percent >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }

    // Displays the complete scorecard in tabular format
    static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {

        System.out.println("Stud\tPhy\tChem\tMath\tTotal\tAverage\tPercent\tGrade");

        // Loop to display details of each student
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "\t" +
                            grades[i]
            );
        }
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Generate scores, calculate results and grades, and display scorecard
        int[][] pcmScores = generatePCMScores(students);
        double[][] results = calculateResults(pcmScores);
        String[] grades = calculateGrades(results);

        displayScoreCard(pcmScores, results, grades);
    }
}
