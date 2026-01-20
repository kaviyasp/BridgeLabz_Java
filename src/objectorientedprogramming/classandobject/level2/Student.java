/*
Program: Program to Simulate Student Report

Problem Statement:
Create a Student class with attributes name, rollNumber, and marks.
Add two methods:
1. To calculate the grade based on the marks.
2. To display the student's details and grade.

Explanation:
The Student class organizes student details as attributes.
Methods are used to calculate grade and display information.
*/

package objectorientedprogramming.classandobject.level2;

import java.util.Scanner;

public class Student {

    String name;
    int rollNumber;
    int marks;

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else
            return 'D';
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\nStudent Report:");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Creating object
        Student s = new Student();

        // Taking input from user
        System.out.print("Enter name: ");
        s.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        s.rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        s.marks = sc.nextInt();

        s.displayDetails();
        sc.close();
    }
}
