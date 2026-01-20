/*
Find unique characters in a string using the charAt() method and display the result
Hint =>
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

package CoreProgramming.String.Level3;

import java.util.Scanner;

class UniqueCharacters {

    // Finds length of string without using length() method
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    // Finds unique characters using nested loops
    static char[] uniqueCharacters(String text) {

        int length = findLength(text);
        char[] temp = new char[length];
        int index = 0;

        // Outer loop to pick each character
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if character already appeared
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Store character if it is unique
            if (isUnique) {
                temp[index++] = ch;
            }
        }

        // Create exact-sized array for unique characters
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Find and display unique characters
        char[] unique = uniqueCharacters(text);

        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}
