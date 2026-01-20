/*
Write a program that takes a year as input and outputs the Year is a Leap Year or not
Hint =>
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/

package CoreProgramming.Methods.Level2;

import java.util.Scanner;

class LeapYearMethod {

    // Method to check leap year condition
    static boolean isLeapYear(int year) {
        return year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the year
        System.out.println("Enter year:");
        int year = input.nextInt();

        // Check and display result
        if (isLeapYear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
