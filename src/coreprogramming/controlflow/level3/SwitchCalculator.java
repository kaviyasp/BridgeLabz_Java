/*Write a program to create a calculator using switch...case.
Hint =>
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.
*/

package CoreProgramming.ControlFlow.Level3;
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read two numbers
        System.out.println("Enter the 1st number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int n2 = sc.nextInt();

        // Read operator
        System.out.println("Enter the operator (+ or - or * or /) : ");
        String op = sc.next();

        // Perform calculation using switch-case
        switch (op) {
            case "+":
                System.out.println("Result: " + (n1 + n2));
                break;
            case "-":
                System.out.println("Result: " + (n1 - n2));
                break;
            case "*":
                System.out.println("Result: " + (n1 * n2));
                break;
            case "/":
                System.out.println("Result: " + (n1 / n2));
                break;
            default:
                // Handle invalid operator
                System.out.println("invalid input");
        }
    }
}
