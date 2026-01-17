/*
4. Remove Duplicates from a String
Problem:
Write a Java program to remove all duplicate characters from a given string
and return the modified string.
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        String result = "";

        // Loop to pick each character from the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Check if character is not already present in result
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        // Display the result string
        System.out.println("String after removing duplicates: " + result);
    }
}
