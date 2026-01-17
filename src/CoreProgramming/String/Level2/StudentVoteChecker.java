/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote
Hint =>
Create a method to generate random 2-digit ages
Create a method that returns a 2D String array of age and can vote true/false
Create a method to display the 2D array
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class StudentVoteChecker {

    // Generates random 2-digit ages for students
    static int[] generateAges(int n) {
        int[] ages = new int[n];

        // Loop to generate random age for each student
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 10;
        }
        return ages;
    }

    // Checks voting eligibility and stores age with voting status
    static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];

        // Loop to check voting eligibility for each age
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    // Displays age and voting status in tabular format
    static void display(String[][] data) {
        System.out.println("Age\tStatus");

        // Loop to display each student's details
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate ages, check voting eligibility, and display result
        display(checkVoting(generateAges(n)));
    }
}
