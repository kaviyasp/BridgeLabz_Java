/*
Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
*/

package objectorientedprogramming.constructors;
class Circle {

    double radius;

    // Default constructor
    Circle() {
        this(1.0); // Calls parameterized constructor of same class
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {

        // Object created using default constructor
        Circle c1 = new Circle();

        // Object created using parameterized constructor
        Circle c2 = new Circle(5.5);

        // Displaying values using object
        c1.display();
        c2.display();
    }
}
