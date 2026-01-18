package ObjectOrientedProgramming.Encapsulation;

/*
2. E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
*/

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation using getters/setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();

    public void displayFinalPrice() {
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        double discount = calculateDiscount();
        double finalPrice = price + tax - discount;

        System.out.println(name + " Final Price: " + finalPrice);
    }
}

// Electronics class
class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;
    }

    @Override
    public double calculateTax() {
        return price * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST";
    }
}

// Clothing class
class Clothing extends Product {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20;
    }
}

// Groceries class
class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.05;
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {

        Product[] products = {
                new Electronics(1, "Laptop", 60000),
                new Clothing(2, "Dress", 2000),
                new Groceries(3, "Rice", 1000)
        };

        for (Product p : products) {
            p.displayFinalPrice();  // Polymorphism
        }
    }
}
