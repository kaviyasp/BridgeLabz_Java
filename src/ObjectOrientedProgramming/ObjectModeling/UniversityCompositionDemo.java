package ObjectOrientedProgramming.ObjectModeling;

import java.util.ArrayList;

/*
Problem 2: University with Faculties and Departments (Composition and Aggregation)
● Description: Create a University with multiple Faculty members and Department objects. Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
● Tasks:
○ Define a University class with Department and Faculty classes.
○ Demonstrate how deleting a University also deletes its Departments.
○ Show that Faculty members can exist independently of a Department.
● Goal: Understand the differences between composition and aggregation in modeling complex hierarchical relationships.
*/

class UniversityFaculty {
    String name;

    UniversityFaculty(String name) {
        this.name = name;
    }
}

class UniversityDepartment {
    String deptName;

    UniversityDepartment(String deptName) {
        this.deptName = deptName;
    }
}

class UniversityComposition {
    String uniName;
    ArrayList<UniversityDepartment> departments = new ArrayList<>();
    ArrayList<UniversityFaculty> faculties = new ArrayList<>();

    UniversityComposition(String uniName) {
        this.uniName = uniName;
    }

    void addDepartment(UniversityDepartment d) {
        departments.add(d);
    }

    void addFaculty(UniversityFaculty f) {
        faculties.add(f);
    }
}

public class UniversityCompositionDemo {
    public static void main(String[] args) {

        UniversityComposition uni = new UniversityComposition("ABC University");

        UniversityDepartment d1 = new UniversityDepartment("CSE");
        UniversityFaculty f1 = new UniversityFaculty("Dr. Ravi");

        uni.addDepartment(d1);
        uni.addFaculty(f1);

        // Faculty exists independently
        System.out.println("Faculty Name: " + f1.name);

        // Composition: deleting university removes departments
        uni = null;
        System.out.println("University deleted along with its departments");
    }
}
