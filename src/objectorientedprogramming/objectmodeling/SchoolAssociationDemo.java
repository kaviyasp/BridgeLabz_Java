package objectorientedprogramming.objectmodeling;

import java.util.ArrayList;

/*
Problem 1: School and Students with Courses (Association and Aggregation)
● Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
● Tasks:
○ Define School, Student, and Course classes.
○ Model an association between Student and Course to show that students can enroll in multiple courses.
○ Model an aggregation relationship between School and Student.
○ Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
● Goal: Practice association by modeling many-to-many relationships between students and courses.
*/

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + " enrolled courses:");
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolAssociationDemo {
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student("Kaviya");
        Student s2 = new Student("Anu");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        s1.viewCourses();
        c1.showStudents();
    }
}
