package CoreProgramming.Methods.Level3;

import java.util.Scanner;

class CalendarDisplay {

    // Returns the month name based on month number
    static String getMonthName(int month) {
        String[] months = {
                "", "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        return months[month];
    }

    // Checks whether the given year is a leap year
    static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    // Returns number of days in a given month and year
    static int getDaysInMonth(int month, int year) {
        int[] days = {
                0, 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        // Adjust days for February in leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month];
    }

    // Calculates the first day of the month (0 = Sunday)
    static int getFirstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Print month and year heading
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Loop to print spaces before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Loop to print all days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
