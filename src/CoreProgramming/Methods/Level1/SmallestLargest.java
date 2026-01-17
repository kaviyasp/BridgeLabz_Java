/*Write a program to find the smallest and the largest of the 3 numbers.
Hint =>
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
*/

package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class SmallestLargest {

    // Method to find smallest and largest number
    public static int[] findSmallestAndLargest(int a, int b, int c){
        int small = a;
        int large = a;

        if (b < small) small = b;
        if (c < small) small = c;

        if (b > large) large = b;
        if (c > large) large = c;

        return new int[]{small, large};
    }

    public static void main (String[] args){

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read three numbers
        System.out.println("Enter first number:");
        int n1 = input.nextInt();

        System.out.println("Enter second number:");
        int n2 = input.nextInt();

        System.out.println("Enter third number:");
        int n3 = input.nextInt();

        // Call method to find smallest and largest
        int[] result = findSmallestAndLargest(n1, n2, n3);

        // Display result
        System.out.println("Smallest number is " + result[0]);
        System.out.println("Largest number is " + result[1]);
    }
}
