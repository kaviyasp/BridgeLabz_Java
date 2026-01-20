/*Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint =>
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop.
*/

package CoreProgramming.ControlFlow.Level2;
import java.util.Scanner;

class MultiplesWhile {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Check if number is valid (positive and less than 100)
        if (number > 0 && number < 100) {

            int counter = 100; // Start checking from 100

            System.out.println("Multiples:");

            // Loop backward using while loop
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            // Handle invalid input
            System.out.println("Invalid input");
        }
    }
}
