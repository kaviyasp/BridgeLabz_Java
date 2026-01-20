/*Create a program to find the BMI of a person
Hint =>
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
*/

package CoreProgramming.ControlFlow.Level3;
import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read weight and height from user
        System.out.println("Enter weight in kg:");
        double weight = input.nextDouble();

        System.out.println("Enter height in cm:");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters and calculate BMI
        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        // Determine weight status based on BMI value
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display BMI and weight status
        System.out.println("BMI is " + bmi);
        System.out.println("Weight Status: " + status);
    }
}
