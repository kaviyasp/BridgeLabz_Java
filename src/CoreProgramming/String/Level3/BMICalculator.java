/*
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint =>
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

package CoreProgramming.String.Level3;

import java.util.Scanner;

class BMICalculator {

    // Calculates BMI and health status for one person
    static String[] calculateBMIAndStatus(double weight, double heightCm) {

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI using formula
        double bmi = weight / (heightMeter * heightMeter);

        // Round BMI value to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        // Determine BMI status
        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        // Return height, weight, BMI and status as String array
        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.valueOf(bmi),
                status
        };
    }

    // Computes BMI details for all persons
    static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        // Loop to calculate BMI for each person
        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMIAndStatus(data[i][0], data[i][1]);
        }
        return result;
    }

    // Displays BMI result in tabular format
    static void display(String[][] result) {

        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");

        // Loop to display details of each person
        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            result[i][0] + "\t\t" +
                            result[i][1] + "\t\t" +
                            result[i][2] + "\t" +
                            result[i][3]
            );
        }
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // 2D array to store weight and height of 10 persons
        double[][] data = new double[10][2];

        // Loop to take input for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Compute BMI and display result
        String[][] bmiResult = computeBMI(data);
        display(bmiResult);
    }
}
