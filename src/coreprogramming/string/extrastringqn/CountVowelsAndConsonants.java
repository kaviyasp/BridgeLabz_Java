/*
1. Count Vowels and Consonants
Problem:
Write a Java program to count the number of vowels and consonants in a given string.
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class CountVowelsAndConsonants {

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        // Loop to check each character in the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Check only alphabet characters
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                // Convert character to lowercase
                ch = Character.toLowerCase(ch);

                // Check if character is a vowel or consonant
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Display the result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
