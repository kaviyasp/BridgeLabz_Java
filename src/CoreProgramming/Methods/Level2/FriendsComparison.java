/*
Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint =>
Take user input for age and height for the 3 friends and store it in two arrays
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class FriendsComparison {

    // Method to find the youngest age
    static int findYoungest(int[] age) {
        int min = age[0];
        for (int i = 1; i < age.length; i++) {
            if (age[i] < min) min = age[i];
        }
        return min;
    }

    // Method to find the tallest height
    static double findTallest(double[] height) {
        double max = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) max = height[i];
        }
        return max;
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        // Read age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age:");
            age[i] = input.nextInt();

            System.out.println("Enter height:");
            height[i] = input.nextDouble();
        }

        // Display youngest and tallest
        System.out.println("Youngest age is " + findYoungest(age));
        System.out.println("Tallest height is " + findTallest(height));
    }
}
