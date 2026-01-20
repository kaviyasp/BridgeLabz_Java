/* Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators.
Hint =>
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {

        // Scanner object to read input values
        Scanner input = new Scanner(System.in);

        // Read integer values a, b, and c
        System.out.println("Enter value of a:");
        int a = input.nextInt();

        System.out.println("Enter value of b:");
        int b = input.nextInt();

        System.out.println("Enter value of c:");
        int c = input.nextInt();

        // Perform integer operations to understand operator precedence
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display all results
        System.out.println(
                "The results of Int Operations are " +
                        result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );
    }
}
