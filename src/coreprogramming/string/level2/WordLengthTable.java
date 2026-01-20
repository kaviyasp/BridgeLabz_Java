/*
Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to split the text into words using the charAt() method without using the String built-in split() method
Create a method to find and return a string's length without using the length() method
Create a method to return a 2D array of word and its length
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class WordLengthTable {

    // Finds length of a string without using length() method
    static int findLength(String text) {
        int count = 0;
        try {
            // Infinite loop to access characters one by one
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // Exception occurs when index exceeds string length
            return count;
        }
    }

    // Splits the text into words using charAt()
    static String[] splitWords(String text) {
        int count = 1;

        // Loop to count number of words based on spaces
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        String temp = "";
        int index = 0;

        // Loop to build words character by character
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                temp += text.charAt(i);
            else {
                words[index++] = temp;
                temp = "";
            }
        }

        // Store the last word
        words[index] = temp;
        return words;
    }

    // Creates a 2D array with word and its length
    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        // Loop to store word and its length
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {

        // Scanner object to read input text
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Generate table of words and their lengths
        String[][] table = wordWithLength(splitWords(text));

        // Display result in tabular format
        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }
}
