/*
Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint =>
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/

package CoreProgramming.String.Level1;

import java.util.Scanner;

class SubstringCompare {

    // Creates substring using charAt() method
    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";

        // Loop to build substring character by character
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // Compares two strings character by character
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        // Loop to compare each character
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Get substring using user-defined and built-in methods
        String userSubstring = substringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);

        // Display both substrings
        System.out.println("Substring using charAt(): " + userSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);

        // Compare both substrings and display result
        boolean result = compareStrings(userSubstring, builtInSubstring);
        System.out.println("Are both substrings equal? " + result);
    }
}
