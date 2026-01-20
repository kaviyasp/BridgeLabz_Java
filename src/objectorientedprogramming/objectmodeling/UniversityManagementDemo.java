package objectorientedprogramming.objectmodeling;

import java.util.ArrayList;

/*
Problem 5: University Management System
● Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses.
● Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and courses.
*/

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class Course2 {
    String courseName;
    Professor professor;

    Course2(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
    }
}

class Student2 {
    String name;
    ArrayList<Course2> courses = new ArrayList<>();

    Student2(String name) {
        this.name = name;
    }

    void enrollCourse(Course2 c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.courseName);
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {

        Student2 s = new Student2("Kaviya");
        Professor p = new Professor("Dr. Kumar");
        Course2 c = new Course2("Java Programming");

        c.assignProfessor(p);
        s.enrollCourse(c);

        System.out.println("Course taught by: " + c.professor.name);
    }
}
