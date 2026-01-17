/*
Write a program to demonstrate IllegalArgumentException
Hint =>
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

package CoreProgramming.String.Level1;

import java.util.Scanner;

class IllegalArgumentDemo {

    // Method to demonstrate and handle IllegalArgumentException
    static void handleException(String text) {
        try {
            // Passing start index greater than end index
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            // Handles IllegalArgumentException
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            // Handles any other runtime exception
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call method to demonstrate exception handling
        handleException(text);
    }
}
