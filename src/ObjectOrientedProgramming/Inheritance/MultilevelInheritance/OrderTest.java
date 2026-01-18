package ObjectOrientedProgramming.Inheritance.MultilevelInheritance;

/*
Multilevel Inheritance
Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
*/

// Base class
class Order {
    int orderId;
    String orderDate;

    // Constructor to initialize order details
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return order status
    String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass extending Order
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor to initialize order and shipping details
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // calling Order constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding method
    String getOrderStatus() {
        return "Order Shipped";
    }
}

// Subclass extending ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor to initialize order, shipping, and delivery details
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding method
    String getOrderStatus() {
        return "Order Delivered";
    }
}

// Main class
public class OrderTest {
    public static void main(String[] args) {

        // Creating DeliveredOrder object (multilevel inheritance)
        DeliveredOrder order = new DeliveredOrder(
                101,
                "10-01-2026",
                "TRK12345",
                "15-01-2026"
        );

        // Displaying order status
        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
