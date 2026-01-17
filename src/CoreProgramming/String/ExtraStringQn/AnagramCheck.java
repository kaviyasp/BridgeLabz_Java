/*
11. Check if Two Strings Are Anagrams
Problem:
Accept two strings from the user and check if they are anagrams (contain same letters in any order).
Example Input: "listen", "silent"
Expected Output: Strings are anagrams
*/

package CoreProgramming.String.ExtraStringQn;

import java.util.Scanner;

class AnagramCheck {

    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[256]; // frequency array

        // Count characters for s1 and subtract for s2
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}
