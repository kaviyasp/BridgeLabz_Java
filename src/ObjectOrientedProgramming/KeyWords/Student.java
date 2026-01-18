package ObjectOrientedProgramming.KeyWords;

/*
Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:
1. Static:
○ A static variable universityName shared across all students.
○ A static method displayTotalStudents() to show the number of students enrolled.
2. This:
○ Use this in the constructor to initialize name, rollNumber, and grade.
3. Final:
○ Use a final variable rollNumber for each student that cannot be changed.
4. Instanceof:
○ Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
*/

class Student {

    // static variable shared by all students
    static String universityName = "Anna University";

    // static variable to count total students
    static int totalStudents = 0;

    // student name
    String name;

    // final roll number (cannot be changed)
    final int rollNumber;

    // student grade
    char grade;

    // constructor to initialize student details
    Student(String name, int rollNumber, char grade) {

        // this refers to current object
        this.name = name;

        // initializing final variable
        this.rollNumber = rollNumber;

        // assigning grade
        this.grade = grade;

        // increment student count
        totalStudents++;
    }

    // static method to display total students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // method to display student details
    void display(Object obj) {

        // checking whether object is Student type
        if (obj instanceof Student) {

            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {

        // creating Student object
        Student s1 = new Student("Kaviya", 101, 'A');

        // displaying student details
        s1.display(s1);

        // displaying total students
        displayTotalStudents();
    }
}
