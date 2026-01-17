/*
Program: Program to Compute Area of a Circle

Problem Statement:
Write a program to create a Circle class with an attribute radius.
Add methods to calculate and display the area and circumference of the circle.
*/

package ObjectOrientedProgramming.ClassAndObject.Level1;

import java.util.Scanner;

class Circle {

    // Variable to store radius
    double radius;

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Circle object
        Circle c = new Circle();

        // Take radius input
        System.out.print("Enter radius of the circle: ");
        c.radius = sc.nextDouble();

        // Display results
        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Circumference of Circle: " + c.calculateCircumference());

        sc.close();
    }
}
