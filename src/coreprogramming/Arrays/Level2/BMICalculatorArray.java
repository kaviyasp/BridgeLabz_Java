/*
An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team.
For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint =>
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person
*/

package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

class BMICalculatorArray {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read number of persons
        System.out.println("Enter number of persons:");
        int n = input.nextInt();

        // Arrays to store weight, height, BMI and status
        double[] weight = new double[n];
        double[] heightCm = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Read data and calculate BMI
        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ":");
            weight[i] = input.nextDouble();

            System.out.println("Enter height (cm) of person " + (i + 1) + ":");
            heightCm[i] = input.nextDouble();

            // Convert height to meters and compute BMI
            double heightMeter = heightCm[i] / 100;
            bmi[i] = weight[i] / (heightMeter * heightMeter);

            // Determine weight status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display BMI report
        System.out.println("\nBMI Report:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " | Height: " + heightCm[i] + " cm" +
                            " | Weight: " + weight[i] + " kg" +
                            " | BMI: " + bmi[i] +
                            " | Status: " + status[i]
            );
        }
    }
}
