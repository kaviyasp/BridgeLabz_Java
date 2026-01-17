/*
Problem 1: University Management System
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members.
*/

package ObjectOrientedProgramming.Constructors.AccessModifiers;

class Student {

    // Public variable: accessible everywhere
    public int rollNumber;

    // Protected variable: accessible in same package and subclasses
    protected String name;

    // Private variable: accessible only inside this class
    private double CGPA;

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access private variable
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify private variable
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass
class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void displayDetails() {
        // Accessing public and protected members
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Kaviya", 8.7);
        pg.displayDetails();
    }
}
