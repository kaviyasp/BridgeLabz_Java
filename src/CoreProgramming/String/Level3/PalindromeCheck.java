/*
Write a program to to check if a text is palindrome and display the result
Hint =>
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome.
Logic 2: Write a recursive method to compare the characters from the start and end of the text.
Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays.
Finally, in the main method do palindrome check using the three logic and display result
*/

package CoreProgramming.String.Level3;

import java.util.Scanner;

class PalindromeCheck {

    // Palindrome check using loop and two pointers
    static boolean checkLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Compare characters from start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Palindrome check using recursion
    static boolean checkRecursion(String text, int start, int end) {

        // Base case: indices crossed
        if (start >= end)
            return true;

        // If characters do not match
        if (text.charAt(start) != text.charAt(end))
            return false;

        // Recursive call with updated indices
        return checkRecursion(text, start + 1, end - 1);
    }

    // Palindrome check using character arrays
    static boolean checkUsingArray(String text) {

        // Convert string to character array
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        // Reverse the character array
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Palindrome checks using three methods
        System.out.println("Palindrome (Loop): " + checkLoop(text));
        System.out.println("Palindrome (Recursion): " +
                checkRecursion(text, 0, text.length() - 1));
        System.out.println("Palindrome (Array): " + checkUsingArray(text));
    }
}
