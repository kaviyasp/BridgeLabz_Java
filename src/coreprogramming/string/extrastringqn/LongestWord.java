/*
5. Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the sentence.
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class LongestWord {

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        String longestWord = "";

        // Loop to check length of each word
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        // Display the longest word
        System.out.println("Longest word: " + longestWord);
    }
}
