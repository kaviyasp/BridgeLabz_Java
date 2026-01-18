package ObjectOrientedProgramming.Encapsulation;

/*
3. Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
*/

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleNumber;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    abstract double calculateRentalCost(int days);
}

// Car class
class Car extends Vehicle implements Insurable {

    public Car(String number, double rate) {
        super(number, rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

// Bike class
class Bike extends Vehicle {

    public Bike(String number, double rate) {
        super(number, rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {

    public Truck(String number, double rate) {
        super(number, rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days * 1.2;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("TN01", 2000),
                new Bike("TN02", 500),
                new Truck("TN03", 4000)
        };

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: " + v.calculateRentalCost(3));

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance Cost: " + i.calculateInsurance());
            }
            System.out.println("-------------------");
        }
    }
}
