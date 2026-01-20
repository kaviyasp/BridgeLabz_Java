/*
Write a program to find the frequency of characters in a string using the charAt() method and display the result
Hint =>
Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.
*/

package CoreProgramming.String.Level3;

import java.util.Scanner;

class CharacterFrequency {

    // Finds frequency of each character in the string
    static String[][] findCharacterFrequency(String text) {

        // Array to store frequency of ASCII characters
        int[] frequency = new int[256];

        // Loop to count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count number of unique characters
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        // 2D array to store character and its frequency
        String[][] result = new String[count][2];
        int index = 0;

        // Loop to store character and frequency in result array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    // Displays character frequency in tabular format
    static void displayFrequency(String[][] data) {

        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------------------");

        // Loop to display each character and its frequency
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find and display character frequency
        String[][] frequencyData = findCharacterFrequency(text);
        displayFrequency(frequencyData);
    }
}
