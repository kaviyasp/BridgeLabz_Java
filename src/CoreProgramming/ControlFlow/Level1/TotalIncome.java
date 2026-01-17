/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/

package CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the number from user
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is divisible by 5
        if (n % 5 == 0) {
            System.out.println("Is the number " + n + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + n + " divisible by 5? No");
        }
    }
}
