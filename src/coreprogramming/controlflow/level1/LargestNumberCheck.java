/* Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P =>
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/

package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

class LargestNumberCheck {
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

        // Check which number is the largest
        boolean firstLargest = number1 > number2 && number1 > number3;
        boolean secondLargest = number2 > number1 && number2 > number3;
        boolean thirdLargest = number3 > number1 && number3 > number2;

        // Display the results
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
    }
}
