/*Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
 */

package CoreProgramming.ControlFlow.Level3;

import java.util.Scanner;

class LeapYearSingleIf {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the year from user
        System.out.println("Enter the year:");
        int year = input.nextInt();

        // Single if condition using logical operators to check leap year
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("The Year is a Leap Year");
        } else if (year >= 1582) {
            System.out.println("The Year is not a Leap Year");
        } else {
            // Handle invalid year
            System.out.println("Year should be 1582 or later");
        }
    }
}
