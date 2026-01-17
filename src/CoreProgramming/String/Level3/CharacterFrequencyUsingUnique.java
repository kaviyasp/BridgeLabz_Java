/*
Write a program to find the frequency of characters in a string using unique characters and display the result
Hint =>
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies.
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.
*/

package CoreProgramming.String.Level3;

import java.util.Scanner;

class CharacterFrequencyUsingUnique {

    // Finds unique characters in the given string
    static char[] findUniqueCharacters(String text) {

        // Temporary array to store unique characters
        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        // Outer loop to pick each character
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if character already appeared
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Store character if it is unique
            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create exact size array for unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Finds frequency of characters using unique characters
    static String[][] findFrequency(String text) {

        // Array to store frequency of ASCII characters
        int[] frequency = new int[256];

        // Loop to count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Get unique characters from the text
        char[] uniqueChars = findUniqueCharacters(text);

        // 2D array to store character and its frequency
        String[][] result = new String[uniqueChars.length][2];

        // Loop to store character and frequency in result array
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(frequency[ch]);
        }

        return result;
    }

    // Displays character frequencies
    static void displayResult(String[][] data) {

        System.out.println("\nCharacter\tFrequency");
        System.out.println("----------------------");

        // Loop to print character and its frequency
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find and display character frequency
        String[][] frequencyData = findFrequency(text);
        displayResult(frequencyData);
    }
}
