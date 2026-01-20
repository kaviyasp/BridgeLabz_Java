/*
Write a program to find the first non-repeating character in a string and show the result
Hint =>
Non-repeating character is a character that occurs only once in the string
Create a Method to find the first non-repeating character in a string using the charAt() method and return the character. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Loop through the text to find the first non-repeating character in the text by checking the frequency of each character
In the main function take user inputs, call user-defined methods, and displays result.
*/

package CoreProgramming.String.Level3;

import java.util.Scanner;

class FirstNonRepeating {

    // Finds and returns the first non-repeating character
    static char firstNonRepeating(String text) {

        // Array to store frequency of ASCII characters
        int[] freq = new int[256];

        // Loop to count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Loop to find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        // Return null character if no non-repeating character exists
        return '\0';
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Find first non-repeating character
        char result = firstNonRepeating(text);

        if (result != '\0')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found");
    }
}
