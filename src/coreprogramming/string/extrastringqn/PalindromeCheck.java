/*
3. Palindrome String Check
Problem:
Write a Java program to check if a given string is a palindrome
(a string that reads the same forward and backward).
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class PalindromeCheck {

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        String reversed = "";

        // Loop to reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // Check if original string and reversed string are equal
        if (text.equals(reversed)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}
