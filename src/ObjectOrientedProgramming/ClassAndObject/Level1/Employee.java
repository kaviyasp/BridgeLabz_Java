/*
Program: Program to Display Employee Details

Problem Statement:
Write a program to create an Employee class with attributes name, id, and salary.
Add a method to display the details.
*/

package ObjectOrientedProgramming.ClassAndObject.Level1;

import java.util.Scanner;

class Employee {

    // Instance variables
    String name;
    int id;
    double salary;

    // Method to display employee details
    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Create Employee object
        Employee emp = new Employee();

        // Taking input from user
        System.out.print("Enter Employee Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        emp.id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        emp.salary = sc.nextDouble();

        // Display details
        emp.displayDetails();

        sc.close();
    }
}
