/*
Write a program to demonstrate StringIndexOutOfBoundsException
Hint =>
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

package CoreProgramming.String.Level1;

import java.util.Scanner;

class StringIndexDemo {

    // Method that generates StringIndexOutOfBoundsException
    static void generateException(String text) {
        // Accessing character beyond string length
        System.out.println(text.charAt(text.length()));
    }

    // Method that handles StringIndexOutOfBoundsException
    static void handleException(String text) {
        try {
            // Accessing invalid index inside try block
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("StringIndexOutOfBoundsException caught");
        }
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call method to demonstrate exception handling
        handleException(text);
    }
}
