/*
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint =>
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status.
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class BMICalculatorTeam {

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status for each person
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // 2D array to store weight, height, and BMI
        double[][] personData = new double[10][3];

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            personData[i][0] = input.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            personData[i][1] = input.nextDouble();
        }

        // Calculate BMI and status
        calculateBMI(personData);
        String[] bmiStatus = getBMIStatus(personData);

        // Display BMI report
        System.out.println("\nBMI Report:");
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " | Weight: " + personData[i][0] +
                            " kg | Height: " + personData[i][1] +
                            " cm | BMI: " + personData[i][2] +
                            " | Status: " + bmiStatus[i]
            );
        }
    }
}
