/*
Write a program to check if two texts are anagrams and display the result
Hint =>
An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result.
*/

package CoreProgramming.String.Level3;

import java.util.Scanner;

class AnagramCheck {

    // Checks whether two strings are anagrams
    static boolean isAnagram(String a, String b) {

        // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) return false;

        int[] freq = new int[256];   // Array to store character frequencies

        // Loop to update frequency count for both strings
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        // Loop to check if all frequencies are zero
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String t1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String t2 = sc.nextLine();

        // Display whether the texts are anagrams
        System.out.println("Are anagrams? " + isAnagram(t1, t2));
    }
}
