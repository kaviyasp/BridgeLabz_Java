package ObjectOrientedProgramming.ObjectModeling;

import java.util.ArrayList;

/*
Problem 3: Hospital, Doctors, and Patients (Association and Communication)
● Description: Model a Hospital where Doctor and Patient objects interact through consultations. A doctor can see multiple patients, and each patient can consult multiple doctors.
● Tasks:
○ Define a Hospital class containing Doctor and Patient classes.
○ Create a method consult() in the Doctor class to show communication.
○ Model an association between doctors and patients.
● Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.
*/

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.name);
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}

public class HospitalAssociationDemo {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Dr. Smith");
        Patient p1 = new Patient("Riya");

        d1.consult(p1);
    }
}
