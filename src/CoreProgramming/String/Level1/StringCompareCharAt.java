/*
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint =>
Take user input using the Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result
*/

package CoreProgramming.String.Level1;

import java.util.Scanner;

class StringCompareCharAt {

    // Compares two strings character by character using charAt()
    static boolean compareUsingCharAt(String s1, String s2) {

        // Check length first
        if (s1.length() != s2.length()) return false;

        // Loop to compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string1: ");
        String s1 = sc.next();

        System.out.println("Enter the string2: ");
        String s2 = sc.next();

        // Compare strings using user-defined method
        boolean userResult = compareUsingCharAt(s1, s2);

        // Compare strings using built-in equals() method
        boolean builtInResult = s1.equals(s2);

        // Display comparison results
        System.out.println("Using charAt(): " + userResult);
        System.out.println("Using equals(): " + builtInResult);
    }
}
