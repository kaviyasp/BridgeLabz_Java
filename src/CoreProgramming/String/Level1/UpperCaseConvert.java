/*
Write a program to convert the complete text to uppercase and compare the results
Hint =>
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result
*/

package CoreProgramming.String.Level1;

import java.util.Scanner;

class UpperCaseConvert {

    // Converts all lowercase characters to uppercase using ASCII logic
    static String convertUpper(String text) {
        String result = "";

        // Loop to process each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);   // Convert to uppercase
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

        // Convert text to uppercase using user-defined and built-in methods
        String userUpper = convertUpper(text);
        String builtInUpper = text.toUpperCase();

        // Display both results
        System.out.println("User-defined Uppercase: " + userUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);

        // Compare both uppercase strings
        System.out.println("Are both same? " + compare(userUpper, builtInUpper));
    }
}
