/*
Write a program to find and return the length of a string without using the length() method
Hint =>
Take user input using the Scanner next() method
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class StringLengthFinder {

    // Finds length of string without using length() method
    static int findLength(String text) {
        int count = 0;

        try {
            // Infinite loop to access characters one by one
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // Exception occurs when index goes out of range
            return count;
        }
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        // Display length using user-defined and built-in methods
        System.out.println("Length using user method: " + findLength(text));
        System.out.println("Length using built-in: " + text.length());
    }
}
