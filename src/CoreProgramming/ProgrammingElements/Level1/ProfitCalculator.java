/* Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191.
Hint =>
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P =>
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
*/

package CoreProgramming.ProgrammingElements.Level1;

class ProfitCalculator {
    public static void main(String[] args) {

        // Cost price and selling price values
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit and profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Display all results using a single print statement
        System.out.println(
                "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                        "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}
