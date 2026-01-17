/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint =>
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
*/

package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

class MultiplicationTableSixtoNine {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Array to store multiplication results
        int[] multiplicationResult = new int[4];

        int index = 0;

        // Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}
