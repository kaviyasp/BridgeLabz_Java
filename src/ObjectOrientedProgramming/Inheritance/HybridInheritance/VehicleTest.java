package ObjectOrientedProgramming.Inheritance.HybridInheritance;

/*
Hybrid Inheritance (Simulating Multiple Inheritance)
Since Java doesn’t support multiple inheritance directly, hybrid inheritance is typically achieved through interfaces.
Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.
*/

// Interface for refueling behavior
interface Refuelable {
    void refuel();
}

// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    // Constructor to initialize vehicle details
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

// ElectricVehicle subclass
class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Method specific to electric vehicles
    void charge() {
        System.out.println(model + " is charging");
    }
}

// PetrolVehicle subclass implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implementation of interface method
    public void refuel() {
        System.out.println(model + " is refueling with petrol");
    }
}

// Main class
public class VehicleTest {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

        ev.charge();
        pv.refuel();
    }
}
