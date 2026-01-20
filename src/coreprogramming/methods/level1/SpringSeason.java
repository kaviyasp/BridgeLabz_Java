/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false
*/

package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class SpringSeason {

    // Method to check if the given date is in Spring season
    static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read month and day
        System.out.println("Enter month:");
        int month = input.nextInt();

        System.out.println("Enter day:");
        int day = input.nextInt();

        // Check and display season
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
