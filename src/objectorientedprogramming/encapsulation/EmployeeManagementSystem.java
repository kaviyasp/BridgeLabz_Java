package objectorientedprogramming.encapsulation;

/*
1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
*/

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract Employee class
abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;   // accessible to subclasses
    private String department;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and setters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("----------------------");
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee implements Department {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    // Fixed salary
    @Override
    double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void assignDepartment(String dept) {
        setDepartment(dept);
    }

    @Override
    public String getDepartmentDetails() {
        return getDepartment();
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Salary based on hours
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String dept) {
        setDepartment(dept);
    }

    @Override
    public String getDepartmentDetails() {
        return getDepartment();
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Kaviya", 50000);
        Employee e2 = new PartTimeEmployee(102, "Anu", 40, 500);

        ((Department) e1).assignDepartment("HR");
        ((Department) e2).assignDepartment("IT");

        // Polymorphism
        Employee[] employees = {e1, e2};

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
