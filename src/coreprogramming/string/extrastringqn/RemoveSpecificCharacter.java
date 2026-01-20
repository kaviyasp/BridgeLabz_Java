/*
10. Remove a Specific Character from a String
Problem:
Write a Java program to remove all occurrences of a specific character from a string.
Example Input: "Hello World", Character to Remove: 'l'
Expected Output: "Heo Word"
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class RemoveSpecificCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char removeChar = sc.next().charAt(0);

        String result = "";

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != removeChar) { // include only characters not equal to removeChar
                result += ch;
            }
        }

        System.out.println("Modified String: " + result);
    }
}
