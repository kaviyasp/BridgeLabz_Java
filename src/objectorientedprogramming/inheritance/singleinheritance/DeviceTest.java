package objectorientedprogramming.inheritance.singleinheritance;

/*
Single Inheritance
Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
*/

// Superclass Device
class Device {
    String deviceId;
    boolean status;

    // Constructor to initialize device details
    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

// Subclass Thermostat extending Device
class Thermostat extends Device {
    int temperatureSetting;

    // Constructor to initialize device and thermostat details
    Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status); // calling Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class DeviceTest {
    public static void main(String[] args) {

        // Creating Thermostat object
        Thermostat thermostat = new Thermostat("TH1001", true, 24);

        // Displaying thermostat status
        thermostat.displayStatus();
    }
}
