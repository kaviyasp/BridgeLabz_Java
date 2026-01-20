/*
Create a program to divide N number of chocolates among M children.
Print the number of chocolates each child will get and also the remaining chocolates
*/

package CoreProgramming.Methods.Level1;

import java.util.Scanner;

class ChocolateDistribution {

    // Method to find quotient and remainder
    static int[] findRemainderAndQuotient(int chocolates, int children) {
        int eachGets = chocolates / children;   // Chocolates per child
        int remaining = chocolates % children;  // Remaining chocolates
        return new int[]{eachGets, remaining};
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read total chocolates and children
        System.out.println("Enter number of chocolates:");
        int chocolates = input.nextInt();

        System.out.println("Enter number of children:");
        int children = input.nextInt();

        // Call method and get result
        int[] result = findRemainderAndQuotient(chocolates, children);

        // Display result
        System.out.println("Each child gets " + result[0] + " chocolates");
        System.out.println("Remaining chocolates are " + result[1]);
    }
}
