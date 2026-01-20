/* Write a program to find the side of the square whose parameter you read from user
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/

package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Read perimeter of the square
        System.out.println("Enter the perimeter of the square:");
        double perimeter = input.nextDouble();

        // Calculate side length using perimeter formula
        double side = perimeter / 4;

        // Display the result
        System.out.println(
                "The length of the side is " + side +
                        " whose perimeter is " + perimeter
        );
    }
}
