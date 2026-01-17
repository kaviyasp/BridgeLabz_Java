/* Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint =>
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___*/

package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner; // Import Scanner class to take input from user

class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.println("Enter the first number:");
        double number1 = input.nextDouble(); // Read first floating-point number

        System.out.println("Enter the second number:");
        double number2 = input.nextDouble(); // Read second floating-point number

        double add = number1 + number2; // Perform addition
        double sub = number1 - number2; // Perform subtraction
        double mul = number1 * number2; // Perform multiplication
        double div = number1 / number2; // Perform division

        // Print all arithmetic operation results
        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers " +
                        number1 + " and " + number2 + " is " +
                        add + ", " + sub + ", " + mul + ", and " + div
        );
    }
}
