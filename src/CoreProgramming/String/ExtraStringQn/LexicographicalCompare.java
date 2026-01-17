/*
8. Compare Two Strings
Problem:
Write a Java program to compare two strings lexicographically
(dictionary order) without using built-in compare methods.
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class LexicographicalCompare {

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        // Find the minimum length to avoid IndexOutOfBounds
        int minLength = Math.min(s1.length(), s2.length());
        boolean isDifferent = false;

        // Loop to compare characters one by one
        for (int i = 0; i < minLength; i++) {

            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println(s1 + " comes before " + s2);
                isDifferent = true;
                break; // stop comparison after difference is found
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(s2 + " comes before " + s1);
                isDifferent = true;
                break; // stop comparison after difference is found
            }
        }

        // If all characters matched in the common length
        if (!isDifferent) {
            if (s1.length() < s2.length()) {
                System.out.println(s1 + " comes before " + s2);
            } else if (s1.length() > s2.length()) {
                System.out.println(s2 + " comes before " + s1);
            } else {
                System.out.println("Both strings are equal");
            }
        }
    }
}
