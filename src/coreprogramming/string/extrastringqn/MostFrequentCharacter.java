/*
9. Find the Most Frequent Character
Problem:
Write a Java program to find the most frequent character in a string.
Example Input: "success"
Expected Output: Most Frequent Character: 's'
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] freq = new int[256]; // frequency array for ASCII characters

        // Loop through each character and count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Find the character with maximum frequency
        int maxFreq = 0;
        char mostFrequent = '\0';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequent = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
