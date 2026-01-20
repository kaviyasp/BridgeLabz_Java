/*Create a program to find the mean height of players present in a football team.
Hint =>
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
*/

package CoreProgramming.Arrays.Level1;
import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11]; // Array to store heights
        double sum = 0;                    // Variable to store total height

        // Read heights of 11 players and calculate sum
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter height of player " + (i + 1) + ":");
            heights[i] = input.nextDouble();
            sum = sum + heights[i];
        }

        // Calculate mean height
        double mean = sum / heights.length;

        // Display mean height
        System.out.println("Mean height of the football team is " + mean);
    }
}
