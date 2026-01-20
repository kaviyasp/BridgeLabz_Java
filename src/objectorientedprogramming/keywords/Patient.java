package objectorientedprogramming.keywords;

/*
Sample Program 7: Hospital Management System
Create a Patient class with the following features:
1. Static:
○ A static variable hospitalName shared among all patients.
○ A static method getTotalPatients() to count the total patients admitted.
2. This:
○ Use this to initialize name, age, and ailment in the constructor.
3. Final:
○ Use a final variable patientID to uniquely identify each patient.
4. Instanceof:
○ Check if an object is an instance of the Patient class before displaying its details.
*/

class Patient {

    // static variable shared by all patients
    static String hospitalName = "City Hospital";

    // static variable to count patients
    static int totalPatients = 0;

    // patient name
    String name;

    // patient age
    int age;

    // patient ailment
    String ailment;

    // final patient ID
    final int patientID;

    // constructor to initialize patient details
    Patient(String name, int age, String ailment, int patientID) {

        // assigning values using this keyword
        this.name = name;
        this.age = age;
        this.ailment = ailment;

        // initializing final variable
        this.patientID = patientID;

        // incrementing patient count
        totalPatients++;
    }

    // static method to display total patients
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // method to display patient details
    void display(Object obj) {

        // checking whether object is Patient type
        if (obj instanceof Patient) {

            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }

    public static void main(String[] args) {

        // creating Patient object
        Patient p1 = new Patient("Sita", 30, "Fever", 501);

        // displaying patient details
        p1.display(p1);

        // displaying total patients
        getTotalPatients();
    }
}
