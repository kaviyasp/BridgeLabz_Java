/*
Write a program to trim the leading and trailing spaces from a string using the charAt() method
Hint =>
Create a method to trim leading and trailing spaces and return start and end index
Create a substring method using charAt()
Create a method to compare two strings using charAt()
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class TrimString {

    // Finds start and end indexes after removing leading and trailing spaces
    static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop to skip leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Loop to skip trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    // Creates substring using charAt() method
    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";

        // Loop to build trimmed string
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Compares two strings character by character
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;

        // Loop to compare each character
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        // Find trimming indexes
        int[] indexes = findTrimIndexes(text);

        // Trim string using user-defined and built-in methods
        String userTrim = substringUsingCharAt(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();

        // Display results
        System.out.println("User trimmed text: [" + userTrim + "]");
        System.out.println("Built-in trimmed text: [" + builtInTrim + "]");

        // Compare both trimmed strings
        System.out.println("Are both equal? " + compareStrings(userTrim, builtInTrim));
    }
}
