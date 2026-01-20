/*
Problem 1: Product Inventory
Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
*/
package objectorientedprogramming.constructors.instancevsclassvariablesandmethods;

class Product {

    // Instance variables: unique for each object
    String productName;
    double price;

    // Class variable: shared by all objects
    static int totalProducts = 0;

    // Constructor increases total product count when object is created
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method: called using object
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: Rs." + price);
    }

    // Class method: called using class name
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {

        // Creating objects
        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Notebook", 50);

        // Calling instance method using objects
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Calling class method using class name
        Product.displayTotalProducts();
    }
}

