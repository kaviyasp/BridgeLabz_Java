/*
Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint =>
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
*/

package CoreProgramming.Methods.Level3;

class EmployeeBonusCalculator {

    // Generates random salary and years of service for 10 employees
    static double[][] generateSalaryAndService() {
        double[][] data = new double[10][2];

        // Loop to assign salary and years of service
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int)(Math.random() * 11) + 1;       // Years of service
        }
        return data;
    }

    // Calculates bonus and new salary based on years of service
    static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] result = new double[10][2];

        // Loop to calculate bonus and updated salary
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            // Bonus calculation logic
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = bonus;            // Bonus amount
            result[i][1] = salary + bonus;   // New salary
        }
        return result;
    }

    // Displays employee-wise and total salary details
    static void displaySummary(double[][] original, double[][] updated) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        // Loop to print employee details and calculate totals
        for (int i = 0; i < 10; i++) {
            double oldSalary = original[i][0];
            double years = original[i][1];
            double bonus = updated[i][0];
            double newSalary = updated[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%d\t%.0f\t\t%.0f\t%.2f\t%.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        // Display final totals
        System.out.println("-------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t\t%.2f\t%.2f%n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {

        // Generate salary and service data
        double[][] salaryAndService = generateSalaryAndService();

        // Calculate bonus and new salary
        double[][] bonusAndNewSalary = calculateBonusAndNewSalary(salaryAndService);

        // Display complete summary
        displaySummary(salaryAndService, bonusAndNewSalary);
    }
}
