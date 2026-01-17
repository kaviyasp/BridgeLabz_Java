/* Create a program to divide N number of chocolates among M children.
Hint =>
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

class ChocolateDistribution {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read number of chocolates and children
        System.out.println("Enter number of chocolates:");
        int numberOfChocolates = input.nextInt();

        System.out.println("Enter number of children:");
        int numberOfChildren = input.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the result
        System.out.println(
                "The number of chocolates each child gets is " + chocolatesPerChild +
                        " and the number of remaining chocolates are " + remainingChocolates
        );
    }
}
