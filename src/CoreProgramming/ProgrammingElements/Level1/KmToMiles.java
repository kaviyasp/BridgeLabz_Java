/*Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
*/

package CoreProgramming.ProgrammingElements.Level1;

class KmToMiles {
    public static void main(String[] args) {

        // Distance in kilometers
        double kilometers = 10.8;

        // Convert kilometers to miles
        double miles = kilometers / 1.6;

        // Display output
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
