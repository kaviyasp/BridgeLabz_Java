/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
*/

package CoreProgramming.ControlFlow.Level2;

import java.util.Scanner;

class FriendsComparison {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read age and height of Amar
        System.out.println("Enter Amar's age:");
        int amarAge = input.nextInt();
        System.out.println("Enter Amar's height:");
        double amarHeight = input.nextDouble();

        // Read age and height of Akbar
        System.out.println("Enter Akbar's age:");
        int akbarAge = input.nextInt();
        System.out.println("Enter Akbar's height:");
        double akbarHeight = input.nextDouble();

        // Read age and height of Anthony
        System.out.println("Enter Anthony's age:");
        int anthonyAge = input.nextInt();
        System.out.println("Enter Anthony's height:");
        double anthonyHeight = input.nextDouble();

        // Find youngest age and tallest height
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        // Display the youngest friend
        if (youngestAge == amarAge) {
            System.out.println("Amar is the youngest");
        } else if (youngestAge == akbarAge) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        // Display the tallest friend
        if (tallestHeight == amarHeight) {
            System.out.println("Amar is the tallest");
        } else if (tallestHeight == akbarHeight) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
    }
}
