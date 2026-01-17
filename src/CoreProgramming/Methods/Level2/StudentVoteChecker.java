/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint =>
Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age)
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class StudentVoteChecker {

    // Method to check whether a student is eligible to vote
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;      // Invalid age check
        return age >= 18;               // Voting eligibility condition
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to take age input for each student
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age of student " + (i + 1) + ":");
            ages[i] = input.nextInt();

            // Check and display voting eligibility
            if (canStudentVote(ages[i])) {
                System.out.println("Can vote");
            } else {
                System.out.println("Cannot vote");
            }
        }
    }
}
