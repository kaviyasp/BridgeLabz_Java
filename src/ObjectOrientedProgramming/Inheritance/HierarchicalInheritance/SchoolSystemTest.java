package ObjectOrientedProgramming.Inheritance.HierarchicalInheritance;

/*
Hierarchical Inheritance
Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
*/

// Superclass
class Person {
    String name;
    int age;

    // Constructor to initialize common details
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Teacher subclass
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher who teaches " + subject);
    }
}

// Student subclass
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student studying in grade " + grade);
    }
}

// Staff subclass
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member working in " + department);
    }
}

// Main class
public class SchoolSystemTest {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th");
        Staff staff = new Staff("Charlie", 40, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
