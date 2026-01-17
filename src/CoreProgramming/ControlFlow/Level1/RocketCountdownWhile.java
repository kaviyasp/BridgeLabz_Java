/* Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint =>
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter.
*/

package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

class RocketCountdownWhile {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the starting countdown value
        System.out.println("Enter the countdown value:");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
