/*Create a program to find the maximum number of handshakes among N number of students.
Hint =>
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/

package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class handshakes {

    // Method to calculate maximum handshakes using formula
    public static int handshake(int n){
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args){

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read number of people
        System.out.println("Enter the number people:");
        int n = sc.nextInt();

        // Call method to calculate handshakes
        int handshakes = handshake(n);

        // Display result
        System.out.println("The number of handshakes are: " + handshakes);
    }
}
