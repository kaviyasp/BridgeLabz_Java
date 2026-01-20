package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read number of people
        System.out.println("Enter the number people: ");
        int n = sc.nextInt();

        // 2D array to store height, weight, and BMI
        double[][] persondata = new double[n][3];

        // Array to store weight status
        String[] weightStatus = new String[n];

        // Loop to read data and calculate BMI
        for (int j = 0; j < n; j++) {

            // Read height and weight
            System.out.println("Enter the height of person " + (j + 1) + " :");
            persondata[0][j] = sc.nextDouble();

            System.out.println("Enter the weight of person " + (j + 1) + " :");
            persondata[1][j] = sc.nextDouble();

            // Convert height to meters and calculate BMI
            persondata[0][j] = persondata[1][j] / 100;
            persondata[2][j] = persondata[1][j] / (persondata[0][j] * persondata[0][j]);

            // Determine weight status
            if (persondata[2][j] <= 18.4) {
                weightStatus[j] = "Underweight";
            } else if (persondata[2][j] <= 24.9) {
                weightStatus[j] = "Normal";
            } else if (persondata[2][j] <= 39.9) {
                weightStatus[j] = "Overweight";
            } else {
                weightStatus[j] = "Obese";
            }
        }

        // Display BMI report
        System.out.println("\nBMI Report:");
        for (int j = 0; j < n; j++) {
            System.out.println(
                    "Person " + (j + 1) +
                            " | Height: " + persondata[0][j] + " m" +
                            " | Weight: " + persondata[1][j] + " kg" +
                            " | BMI: " + persondata[2][j] +
                            " | Status: " + weightStatus[j]
            );
        }
    }
}
