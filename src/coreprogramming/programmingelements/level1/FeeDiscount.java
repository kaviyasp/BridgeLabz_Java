/* Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint =>
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___
*/

package CoreProgramming.ProgrammingElements.Level1;
import java.util.Scanner;

public class FeeDiscount {
    public static void main(String[] args){

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Read fee amount from user
        System.out.println("Enter the fee: ");
        double fee = sc.nextDouble();

        // Read discount percentage
        System.out.println("Enter the discount percent: ");
        double discountPercent = sc.nextDouble();

        // Calculate discount amount and final fee
        double discountAmount = fee * discountPercent / 100;
        double discountedFee = fee - discountAmount;

        // Print the discount and final payable fee
        System.out.println(
                "The discount amount is INR " + discountAmount +
                        " and final discounted fee is INR " + discountedFee
        );
    }
}
