package ObjectOrientedProgramming.KeyWords;

/*
Sample Program 6: Vehicle Registration System
Create a Vehicle class with the following features:
1. Static:
○ A static variable registrationFee common for all vehicles.
○ A static method updateRegistrationFee() to modify the fee.
2. This:
○ Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
3. Final:
○ Use a final variable registrationNumber to uniquely identify each vehicle.
4. Instanceof:
○ Check if an object belongs to the Vehicle class before displaying its registration
○ details.
*/

class Vehicle {

    // static registration fee for all vehicles
    static double registrationFee = 5000;

    // owner name
    String ownerName;

    // type of vehicle
    String vehicleType;

    // final registration number
    final int registrationNumber;

    // constructor to initialize vehicle details
    Vehicle(String ownerName, String vehicleType, int registrationNumber) {

        // using this keyword to assign values
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;

        // initializing final variable
        this.registrationNumber = registrationNumber;
    }

    // static method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // method to display vehicle details
    void display(Object obj) {

        // checking object type using instanceof
        if (obj instanceof Vehicle) {

            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {

        // creating Vehicle object
        Vehicle v1 = new Vehicle("Ravi", "Bike", 9001);

        // updating registration fee
        updateRegistrationFee(6000);

        // displaying vehicle details
        v1.display(v1);
    }
}
