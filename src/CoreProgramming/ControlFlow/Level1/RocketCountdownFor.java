/*Write a program to count down the number from the user input value to 1 using a for loop for a rocket launch
 */

package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class RocketCountdownFor {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the starting countdown value
        System.out.println("Enter the countdown value:");
        int counter = input.nextInt();

        // Countdown from the given value to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
