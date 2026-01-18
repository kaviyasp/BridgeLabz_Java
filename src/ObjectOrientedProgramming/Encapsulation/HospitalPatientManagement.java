package ObjectOrientedProgramming.Encapsulation;

/*
7. Hospital Patient Management
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.
*/

// Interface for medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract Patient class
abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data kept private
    private String medicalHistory;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    // Abstract billing method
    abstract double calculateBill();

    // Common display method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill Amount: " + calculateBill());
        System.out.println("--------------------------------");
    }

    // Setter for medical history
    public void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    double calculateBill() {
        return 5000;
    }

    public void addRecord(String record) {
        setMedicalHistory(record);
    }

    public void viewRecords() {
        System.out.println("In-patient medical record available");
    }
}

// OutPatient class
class OutPatient extends Patient {

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    double calculateBill() {
        return 800;
    }
}

// Main class
public class HospitalPatientManagement {
    public static void main(String[] args) {

        Patient[] patients = {
                new InPatient(1, "Kaviya", 20),
                new OutPatient(2, "Anu", 22)
        };

        // Polymorphism
        for (Patient p : patients) {
            p.getPatientDetails();
        }
    }
}
