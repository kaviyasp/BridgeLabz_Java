/*Create a program to find the bonuses of employees based on their years of service.
Hint =>
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/

package CoreProgramming.ControlFlow.Level2;
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read salary and years of service
        System.out.println("Enter salary:");
        double salary = input.nextDouble();

        System.out.println("Enter years of service:");
        int years = input.nextInt();

        // Check eligibility and calculate bonus
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } else {
            System.out.println("No bonus applicable");
        }
    }
}
