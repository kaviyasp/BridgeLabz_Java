package ObjectOrientedProgramming.Inheritance.MultilevelInheritance;

/*
Multilevel Inheritance
Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
*/

// Base class
class Course {
    String courseName;
    int duration; // duration in hours

    // Constructor to initialize course details
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

// Subclass extending Course
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor to initialize course and online details
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

// Subclass extending OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    // Constructor to initialize all details
    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate final fee
    double calculateFinalFee() {
        return fee - discount;
    }
}

// Main class
public class CourseTest {
    public static void main(String[] args) {

        // Creating PaidOnlineCourse object
        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Programming",
                40,
                "Udemy",
                true,
                5000,
                1000
        );

        // Displaying course details
        System.out.println("Course Name: " + course.courseName);
        System.out.println("Duration: " + course.duration + " hours");
        System.out.println("Platform: " + course.platform);
        System.out.println("Recorded: " + course.isRecorded);
        System.out.println("Final Fee: " + course.calculateFinalFee());
    }
}