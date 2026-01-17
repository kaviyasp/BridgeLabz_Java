/* Create a program to find the total income of a person by taking salary and bonus from user
Hint =>
Create a variable named salary and take user input.
Create another variable bonus and take user input.
Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read salary and bonus amounts
        System.out.println("Enter the salary:");
        double salary = input.nextDouble();

        System.out.println("Enter the bonus:");
        double bonus = input.nextDouble();

        // Calculate total income
        double income = salary + bonus;

        // Display the total income
        System.out.println(
                "The salary is INR " + salary +
                        " and bonus is INR " + bonus +
                        ". Hence Total Income is INR " + income
        );
    }
}
