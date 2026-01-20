/* Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/

package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

class FirstSmallest {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read three numbers from user
        System.out.println("Enter the first number:");
        int number1 = input.nextInt();

        System.out.println("Enter the second number:");
        int number2 = input.nextInt();

        System.out.println("Enter the third number:");
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}
