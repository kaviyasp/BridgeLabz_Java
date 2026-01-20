/*Create a program to print a multiplication table of a number.
Hint =>
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___
*/

package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

class MultiplicationTableArray {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int[] table = new int[10]; // Array to store multiplication results

        // Generate and display multiplication table from 1 to 10
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
