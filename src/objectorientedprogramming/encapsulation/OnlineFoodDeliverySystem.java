package objectorientedprogramming.encapsulation;

/*
6. Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.
*/

// Interface for discount functionality
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract class for food items
abstract class FoodItem {

    // Private variable for item name
    private String itemName;

    // Protected so subclasses can use
    protected double price;
    protected int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method for price calculation
    abstract double calculateTotalPrice();

    // Common method for displaying item info
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("--------------------------------");
    }
}

// Veg food item
class VegItem extends FoodItem {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    // Veg items have no extra charge
    @Override
    double calculateTotalPrice() {
        return price * quantity;
    }
}

// Non-veg food item
class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    // Non-veg items include extra charge
    @Override
    double calculateTotalPrice() {
        return (price * quantity) + 50;
    }

    // Discount method
    public double applyDiscount() {
        return 30;
    }

    public String getDiscountDetails() {
        return "₹30 discount on Non-Veg items";
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        // Polymorphism: parent reference
        FoodItem[] order = {
                new VegItem("Veg Burger", 100, 2),
                new NonVegItem("Chicken Pizza", 250, 1)
        };

        // Process all food items in one loop
        for (FoodItem item : order) {
            item.getItemDetails();
        }
    }
}
