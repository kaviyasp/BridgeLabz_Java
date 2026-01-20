/* Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint =>
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___
*/

package CoreProgramming.ProgrammingElements.Level1;

class PenDivision {
    public static void main(String[] args) {

        // Total number of pens and students
        int totalPens = 14;
        int students = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        // Display the result
        System.out.println(
                "The Pen Per Student is " + pensPerStudent +
                        " and the remaining pen not distributed is " + remainingPens
        );
    }
}
