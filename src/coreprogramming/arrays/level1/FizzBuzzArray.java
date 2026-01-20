/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint =>
Create a String Array to save the results and
Finally, loop again to show the results of the array based on the index position
*/

package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

class FizzBuzzArray {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // String array to store FizzBuzz results
        String[] result = new String[number + 1];

        // Fill the array based on FizzBuzz rules
        for (int i = 0; i <= number; i++) {
            if (i != 0 && i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i != 0 && i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i != 0 && i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        // Display the stored results
        for (int i = 1; i <= number; i++) {
            System.out.println(result[i]);
        }
    }
}
