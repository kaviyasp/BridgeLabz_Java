/*
12. Replace a Word in a Sentence
Problem:
Write a Java program that replaces a given word with another word in a sentence.
Example Input: "I love Java programming", replace "Java" with "Python"
Expected Output: "I love Python programming"
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class ReplaceWordInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        // Replace all occurrences
        String modifiedSentence = sentence.replace(oldWord, newWord);

        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
