/*
7. Toggle Case of Characters
Problem:
Write a Java program to toggle the case of each character in a given string.
Convert uppercase letters to lowercase and vice versa.
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class ToggleCase {

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = "";

        // Loop to check each character in the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // If lowercase, convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            // If uppercase, convert to lowercase
            else if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            // If not a letter, keep the character as it is
            else {
                result = result + ch;
            }
        }

        // Display the toggled string
        System.out.println("Toggled String: " + result);
    }
}
