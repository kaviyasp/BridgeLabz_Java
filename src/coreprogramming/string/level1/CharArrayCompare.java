/*
Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint =>
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray()
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
*/

package CoreProgramming.String.Level1;

import java.util.Scanner;

class CharArrayCompare {

    // Returns characters of a string without using toCharArray()
    static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];

        // Loop to extract each character from the string
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Compares two character arrays
    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        // Loop to compare each character
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // Get characters using user-defined and built-in methods
        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        // Display characters from user-defined method
        System.out.println("Characters using user-defined method:");
        for (char c : userArray) {
            System.out.print(c + " ");
        }

        // Display characters from built-in method
        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        // Compare both character arrays and display result
        boolean result = compareArrays(userArray, builtInArray);
        System.out.println("\nAre both character arrays equal? " + result);
    }
}
