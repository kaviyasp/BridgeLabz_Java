/*
Write a program to convert the complete text to lowercase and compare the results
Hint =>
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is uppercase to the lowercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. And finally display the result
*/

package CoreProgramming.String.Level1;

import java.util.Scanner;

class LowerCaseConvert {

    // Converts all uppercase characters to lowercase using ASCII logic
    static String convertLower(String text) {
        String result = "";

        // Loop to process each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);   // Convert to lowercase
            }
            result = result + ch;
        }
        return result;
    }

    // Compares two strings character by character
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;

        // Loop to compare each character
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner object to read complete text input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Convert text to lowercase using user-defined and built-in methods
        String userLower = convertLower(text);
        String builtInLower = text.toLowerCase();

        // Display both results
        System.out.println("User-defined Lowercase: " + userLower);
        System.out.println("Built-in Lowercase: " + builtInLower);

        // Compare both lowercase strings
        System.out.println("Are both same? " + compare(userLower, builtInLower));
    }
}
