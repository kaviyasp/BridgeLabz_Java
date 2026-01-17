/*
Write a program to demonstrate NumberFormatException
Hint =>
Define a variable to take user input as a String
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

package CoreProgramming.String.Level1;

import java.util.Scanner;

class NumberFormatDemo {

    // Method to demonstrate and handle NumberFormatException
    static void handleException(String text) {
        try {
            // Attempt to convert text to integer
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            // Handles invalid number format
            System.out.println("NumberFormatException caught");
        } catch (RuntimeException e) {
            // Handles any other runtime exception
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = sc.next();

        // Call method to demonstrate exception handling
        handleException(text);
    }
}
