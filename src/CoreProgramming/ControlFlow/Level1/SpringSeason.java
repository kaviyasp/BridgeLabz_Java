/* Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
Hint =>
Spring Season is from March 20 to June 20
*/

package CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read month and day values
        System.out.println("Enter the month:");
        int month = input.nextInt();

        System.out.println("Enter the day:");
        int day = input.nextInt();

        // Check if the given date falls in Spring Season
        if ((month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20)) {

            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
