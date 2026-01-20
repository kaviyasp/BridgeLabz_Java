package objectorientedprogramming.objectmodeling;

import java.util.ArrayList;

/*
Problem 4: E-commerce Platform with Orders, Customers, and Products
● Description: Design an e-commerce platform with Order, Customer, and Product classes.
● Goal: Show communication and object relationships by designing a system where
customers communicate through orders, and orders aggregate products.
*/

class EcomProduct {
    String productName;

    EcomProduct(String productName) {
        this.productName = productName;
    }
}

class EcomOrder {
    ArrayList<EcomProduct> products = new ArrayList<>();

    void addProduct(EcomProduct p) {
        products.add(p);
    }

    void showProducts() {
        System.out.println("Order contains:");
        for (EcomProduct p : products) {
            System.out.println(" - " + p.productName);
        }
    }
}

class EcomCustomer {
    String name;

    EcomCustomer(String name) {
        this.name = name;
    }

    void placeOrder(EcomOrder order) {
        System.out.println(name + " placed an order");
        order.showProducts();
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {

        EcomCustomer customer = new EcomCustomer("Kaviya");

        EcomOrder order = new EcomOrder();
        order.addProduct(new EcomProduct("Laptop"));
        order.addProduct(new EcomProduct("Mouse"));

        customer.placeOrder(order);
    }
}
