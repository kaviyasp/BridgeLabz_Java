/*
Program: Program to Check Palindrome String

Problem Statement:
Create a PalindromeChecker class with an attribute text.
Add methods to:
1. Check if the text is a palindrome.
2. Display the result.
*/

package ObjectOrientedProgramming.ClassAndObject.Level2;

import java.util.Scanner;

public class PalindromeChecker {

    String text;

    // Method to check palindrome
    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome())
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is NOT a Palindrome.");
    }

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Creating object
        PalindromeChecker pc = new PalindromeChecker();

        // Taking input from user
        System.out.print("Enter a string: ");
        pc.text = sc.nextLine();

        pc.displayResult();
        sc.close();
    }
}
