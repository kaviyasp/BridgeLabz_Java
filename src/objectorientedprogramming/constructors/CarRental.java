package objectorientedprogramming.constructors;

import java.util.Scanner;

/*
Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
*/
class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Parameterized constructor initializes object variables
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method calculates and displays total rental cost
    void calculateCost() {
        double totalCost = rentalDays * costPerDay;
        System.out.println("Total Rental Cost: Rs." + totalCost);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        // Creating object using user input
        CarRental rental = new CarRental(name, model, days);

        // Calling method using object reference
        rental.calculateCost();

        sc.close();
    }
}
