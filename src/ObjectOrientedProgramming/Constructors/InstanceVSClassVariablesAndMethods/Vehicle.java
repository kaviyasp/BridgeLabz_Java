/*
Problem 3: Vehicle Registration
Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.
*/

package ObjectOrientedProgramming.Constructors.InstanceVSClassVariablesAndMethods;
class Vehicle {

    // Instance variables: belong to individual vehicle objects
    String ownerName;
    String vehicleType;

    // Class variable: common for all vehicles
    static double registrationFee = 2000;

    // Constructor initializes vehicle details
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method: displays details of one vehicle
    void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType + " | Fee: Rs." + registrationFee);
    }

    // Class method: updates registration fee for all vehicles
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Anu", "Bike");

        // Display before updating fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update class variable using class method
        Vehicle.updateRegistrationFee(2500);

        // Display after update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

