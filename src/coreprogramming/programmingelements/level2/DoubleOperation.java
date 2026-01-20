/* Similarly, write the DoubleOpt program by taking double values and doing the same operations.*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class DoubleOperation {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read double values from user
        System.out.println("Enter value of a:");
        double a = input.nextDouble();

        System.out.println("Enter value of b:");
        double b = input.nextDouble();

        System.out.println("Enter value of c:");
        double c = input.nextDouble();

        // Perform arithmetic operations using double values
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display all operation results
        System.out.println(
                "The results of Double Operations are " +
                        result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );
    }
}
