/*Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers
Hint =>
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total
Finally display the total value
*/

package CoreProgramming.Arrays.Level1;
import java.util.Scanner;

class ArraySumLimit {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10]; // Array to store numbers
        double total = 0.0;               // Variable to store sum
        int index = 0;                    // Index for array

        // Loop to take inputs until limit or stop condition
        while (true) {
            System.out.println("Enter a number:");
            double value = input.nextDouble();

            // Stop if value is zero/negative or array is full
            if (value <= 0 || index == 10) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        // Display numbers and calculate sum
        System.out.print("The numbers are: [ ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total = total + numbers[i];
        }
        System.out.println("]");

        // Display total sum
        System.out.println("Total sum is " + total);
    }
}
