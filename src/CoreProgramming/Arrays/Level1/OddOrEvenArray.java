/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint =>
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/

package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class OddOrEvenArray {
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // Arrays to store odd and even numbers
        int[] odd = new int[n / 2 + 1];
        int[] even = new int[n / 2 + 1];

        int iOdd = 0;   // Index for odd array
        int iEven = 0;  // Index for even array

        // Check if input is a natural number
        if (n > 0) {

            // Separate odd and even numbers
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    odd[iOdd] = i;
                    iOdd++;
                } else {
                    even[iEven] = i;
                    iEven++;
                }
            }

        } else {
            System.out.println("Invalid n");
        }

        // Print odd numbers
        System.out.print("The odd array is: [ ");
        for (int i = 0; i < iOdd; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println("]");

        // Print even numbers
        System.out.print("The even array is: [ ");
        for (int i = 0; i < iEven; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("]");
    }
}
