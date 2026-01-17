/*Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint =>
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/

package CoreProgramming.Arrays.Level2;

import java.util.Scanner;

public class EmpBonus {
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Arrays to store salary, experience, bonus, and new salary
        int[] salary = new int[10];
        int[] years = new int[10];
        int[] newsalary = new int[10];
        int[] bonus = new int[10];

        int totalbonus = 0;
        int totalsalary = 0;
        int totalnewsalary = 0;

        // Input salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextInt();

            if (salary[i] < 0) {
                System.out.println("Invalid salary");
                i--;
                continue;
            }

            System.out.println("Enter the year of experience of employee " + (i + 1) + ": ");
            years[i] = sc.nextInt();

            if (years[i] < 0) {
                System.out.println("Invalid experience");
                i--;
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (years[i] >= 5) {
                bonus[i] = 5 * salary[i] / 100;
            } else {
                bonus[i] = 2 * salary[i] / 100;
            }

            newsalary[i] = salary[i] + bonus[i];

            totalbonus += bonus[i];
            totalsalary += salary[i];
            totalnewsalary += newsalary[i];
        }

        // Display salary details
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "The salary of employee " + (i + 1) +
                            " is: " + salary[i] +
                            ", the bonus is: " + bonus[i] +
                            ", the new salary is: " + newsalary[i]
            );
        }

        // Display totals
        System.out.println("Total bonus: " + totalbonus);
        System.out.println("Total old salary: " + totalsalary);
        System.out.println("Total new salary: " + totalnewsalary);
    }
}
