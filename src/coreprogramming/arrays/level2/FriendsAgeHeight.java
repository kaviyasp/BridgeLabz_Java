/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
*/

package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

class FriendsAgeHeight {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Arrays to store names, ages, and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Read age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            age[i] = input.nextInt();

            System.out.println("Enter height of " + names[i] + ":");
            height[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest friend is " + names[youngestIndex]);
        System.out.println("Tallest friend is " + names[tallestIndex]);
    }
}
