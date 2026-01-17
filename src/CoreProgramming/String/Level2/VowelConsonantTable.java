/*
Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint =>
Create a method to check if the character is a vowel or consonant and return the result.
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class VowelConsonantTable {

    // Checks whether a character is Vowel, Consonant, or Not a Letter
    static String checkCharacter(char ch) {

        // Convert uppercase character to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    // Analyzes each character in the string and stores result in 2D array
    static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];

        // Loop to analyze each character
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacter(text.charAt(i));
        }
        return result;
    }

    // Displays the character and its type in tabular format
    static void display(String[][] data) {
        System.out.println("Character\tType");

        // Loop to display each row of the table
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Analyze string and display result
        display(analyzeString(text));
    }
}
