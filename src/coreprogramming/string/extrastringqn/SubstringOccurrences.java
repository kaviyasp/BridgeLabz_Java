/*
6. Find Substring Occurrences
Problem:
Write a Java program to count how many times a given substring occurs in a string.
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class SubstringOccurrences {

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int count = 0;

        // Loop to check substring at each possible position
        for (int i = 0; i <= text.length() - sub.length(); i++) {

            // Compare substring of same length with the given substring
            if (text.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        // Display how many times substring occurs
        System.out.println("Substring occurs " + count + " times");
    }
}
