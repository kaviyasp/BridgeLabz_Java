/*
Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint =>
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class VowelConsonantCounter {

    // Checks whether a character is vowel, consonant, or other
    static String checkChar(char ch) {

        // Convert uppercase letter to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Other";
    }

    // Counts vowels and consonants in the given string
    static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        // Loop to check each character in the string
        for (int i = 0; i < text.length(); i++) {
            String result = checkChar(text.charAt(i));

            if (result.equals("Vowel")) vowels++;
            if (result.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        // Scanner object to read input text
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsConsonants(text);

        // Display results
        System.out.println("Vowels count: " + result[0]);
        System.out.println("Consonants count: " + result[1]);
    }
}
