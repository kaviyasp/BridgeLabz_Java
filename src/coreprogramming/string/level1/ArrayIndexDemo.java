/*
Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint =>
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

package CoreProgramming.String.Level1;

import java.util.Scanner;

class ArrayIndexDemo {

    // Method to demonstrate and handle ArrayIndexOutOfBoundsException
    static void handleException(String[] names) {
        try {
            // Accessing index beyond array length
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles specific array index exception
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (RuntimeException e) {
            // Handles any other runtime exception
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Array to store names
        String[] names = new String[3];

        // Loop to take names as input
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // Call method to demonstrate exception handling
        handleException(names);
    }
}
