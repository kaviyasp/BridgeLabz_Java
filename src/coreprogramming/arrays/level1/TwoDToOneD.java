/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint =>
Take user input for rows and columns, create a 2D array (Matrix), and take the user input
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element
*/

package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

class TwoDToOneD {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read rows and columns
        System.out.println("Enter number of rows:");
        int rows = input.nextInt();

        System.out.println("Enter number of columns:");
        int columns = input.nextInt();

        // Create 2D matrix and 1D array
        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];

        int index = 0; // Index for 1D array

        // Read matrix elements and copy to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element:");
                matrix[i][j] = input.nextInt();
                array[index++] = matrix[i][j];
            }
        }

        // Display 1D array elements
        System.out.print("Elements in 1D array: [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
