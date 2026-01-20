/* Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read principal, rate, and time values
        System.out.println("Enter the principal amount:");
        double principal = input.nextDouble();

        System.out.println("Enter the rate of interest:");
        double rate = input.nextDouble();

        System.out.println("Enter the time:");
        double time = input.nextDouble();

        // Calculate simple interest using formula
        double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest
        System.out.println(
                "The Simple Interest is " + simpleInterest +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time
        );
    }
}
