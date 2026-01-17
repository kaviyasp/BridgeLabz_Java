/*
Problem 2: Online Course Management
Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
*/

package ObjectOrientedProgramming.Constructors.InstanceVSClassVariablesAndMethods;
class Course {

    // Instance variables: different for each course object
    String courseName;
    int duration;
    double fee;

    // Class variable: same for all courses
    static String instituteName = "ABC Institute";

    // Constructor initializes course details
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method: displays individual course details
    void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " months | Rs." + fee + " | " + instituteName);
    }

    // Class method: updates institute name for all objects
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {

        // Creating course objects
        Course c1 = new Course("Java", 3, 15000);
        Course c2 = new Course("Python", 2, 12000);

        // Display before updating institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Updating class variable using class method
        Course.updateInstituteName("XYZ Academy");

        // Display after update (affects all objects)
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

