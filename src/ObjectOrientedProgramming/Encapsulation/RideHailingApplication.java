package ObjectOrientedProgramming.Encapsulation;

/*
8. Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
*/

// Interface for GPS functionality
interface GPS {
    void updateLocation(String location);
    String getCurrentLocation();
}

// RENAMED abstract class to avoid conflict
abstract class RideVehicle {

    private int vehicleId;
    private String driverName;
    protected double ratePerKm;

    // Constructor
    public RideVehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method for fare calculation
    abstract double calculateFare(double distance);

    // Concrete method to display details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
    }
}

// RENAMED Car class
class RideCar extends RideVehicle implements GPS {

    private String location;

    public RideCar(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    public void updateLocation(String location) {
        this.location = location;
    }

    public String getCurrentLocation() {
        return location;
    }
}

// RENAMED Bike class
class RideBike extends RideVehicle {

    public RideBike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}

// Auto class (unique name already)
class RideAuto extends RideVehicle {

    public RideAuto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return (ratePerKm * distance) + 20; // extra auto charge
    }
}

// Main class
public class RideHailingApplication {
    public static void main(String[] args) {

        // Polymorphism: parent reference holding child objects
        RideVehicle[] rides = {
                new RideCar(1, "Ravi", 15),
                new RideBike(2, "Suresh", 10),
                new RideAuto(3, "Kumar", 12)
        };

        // Dynamic fare calculation
        for (RideVehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for 10 km: " + v.calculateFare(10));
            System.out.println("--------------------------------");
        }
    }
}
