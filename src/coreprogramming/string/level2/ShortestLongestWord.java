/*
Write a program to split the text into words and find the shortest and longest strings in a given text
Hint =>
Create a Method that returns shortest and longest word indexes
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class ShortestLongestWord {

    // Finds indexes of shortest and longest words
    static int[] findShortestAndLongest(String[] words) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0, maxIndex = 0;

        // Loop to find shortest and longest word lengths
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();

            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        // Scanner object to read input text
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = text.split(" ");

        // Get indexes of shortest and longest words
        int[] result = findShortestAndLongest(words);

        // Display shortest and longest words
        System.out.println("Shortest word: " + words[result[0]]);
        System.out.println("Longest word: " + words[result[1]]);
    }
}
