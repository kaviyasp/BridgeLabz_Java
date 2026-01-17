/*
Write a program to split the text into words, compare the result with the split() method and display the result
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to find the length of the String without using the built-in length() method.
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to compare the two String arrays and return a boolean
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class WordSplitCompare {

    // Splits text into words using charAt() without using split()
    static String[] splitWords(String text) {
        int wordCount = 1;

        // Loop to count number of words based on spaces
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int index = 0;
        String temp = "";

        // Loop to build each word character by character
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }

        // Store the last word
        words[index] = temp;
        return words;
    }

    // Compares two String arrays element by element
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        // Loop to compare each word
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner object to read full text input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Split words using user-defined and built-in methods
        String[] userWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        // Compare both results
        System.out.println("Comparison result: " + compareArrays(userWords, builtInWords));
    }
}
