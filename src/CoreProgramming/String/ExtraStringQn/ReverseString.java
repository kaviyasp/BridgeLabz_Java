/*
2. Reverse a String
Problem:
Write a Java program to reverse a given string without using any built-in reverse functions.
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        String reversed = "";

        // loop from last character to first
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}
