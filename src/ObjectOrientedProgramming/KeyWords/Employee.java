package ObjectOrientedProgramming.KeyWords;

/*
Sample Program 3: Employee Management System
Design an Employee class with the following features:
1. Static:
○ A static variable companyName shared by all employees.
○ A static method displayTotalEmployees() to show the total number of employees.
2. This:
○ Use this to initialize name, id, and designation in the constructor.
3. Final:
○ Use a final variable id for the employee ID, which cannot be modified after assignment.
4. Instanceof
○ Check if a given object is an instance of the Employee class before printing the employee details.
*/

class Employee {

    // static variable shared by all employees
    static String companyName = "Tech Corp";

    // static counter for employees
    static int totalEmployees = 0;

    // employee name
    String name;

    // final employee ID
    final int id;

    // employee designation
    String designation;

    // constructor to initialize employee data
    Employee(String name, int id, String designation) {

        // assigning values using this keyword
        this.name = name;
        this.id = id;
        this.designation = designation;

        // increasing employee count
        totalEmployees++;
    }

    // static method to display employee count
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // method to display employee details
    void display(Object obj) {

        // checking object type
        if (obj instanceof Employee) {

            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {

        // creating Employee object
        Employee e1 = new Employee("Arun", 1, "Developer");

        // displaying employee details
        e1.display(e1);

        // displaying total employees
        displayTotalEmployees();
    }
}
