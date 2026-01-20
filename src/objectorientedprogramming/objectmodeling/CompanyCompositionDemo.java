package objectorientedprogramming.objectmodeling;

import java.util.ArrayList;

/*
Problem 3: Company and Departments (Composition)
● Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
● Tasks:
○ Define a Company class that contains multiple Department objects.
○ Define an Employee class within each Department.
○ Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
● Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.
*/

class Employee {
    String name;

    // Constructor
    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    // Constructor
    Department(String deptName) {
        this.deptName = deptName;
    }

    // Add employee to department
    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    // Constructor
    Company(String companyName) {
        this.companyName = companyName;
    }

    // Add department to company
    void addDepartment(Department dept) {
        departments.add(dept);
    }

    // Display company structure
    void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            System.out.println(" Department: " + d.deptName);
            for (Employee e : d.employees) {
                System.out.println("  Employee: " + e.name);
            }
        }
    }
}

public class CompanyCompositionDemo {
    public static void main(String[] args) {

        // Creating company object
        Company company = new Company("Tech Solutions");

        // Creating departments
        Department dev = new Department("Development");
        Department hr = new Department("HR");

        // Adding employees
        dev.addEmployee("Alice");
        dev.addEmployee("Bob");
        hr.addEmployee("John");

        // Adding departments to company
        company.addDepartment(dev);
        company.addDepartment(hr);

        // Display company details
        company.displayCompanyDetails();

        // When company object is deleted, departments and employees are also removed
        company = null;
        System.out.println("Company deleted. Departments and Employees no longer exist.");
    }
}
