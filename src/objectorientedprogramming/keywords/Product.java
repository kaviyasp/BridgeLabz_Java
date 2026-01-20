package objectorientedprogramming.keywords;

/*
Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
1. Static:
○ A static variable discount shared by all products.
○ A static method updateDiscount() to modify the discount percentage.
2. This:
○ Use this to initialize productName, price, and quantity in the constructor.
3. Final:
○ Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
4. Instanceof:
○ Validate whether an object is an instance of the Product class before processing its details.
*/

class Product {

    // static discount for all products
    static double discount = 10.0;

    // product name
    String productName;

    // product price
    double price;

    // quantity of product
    int quantity;

    // final product ID
    final int productID;

    // constructor to initialize product details
    Product(String productName, double price, int quantity, int productID) {

        // using this keyword
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // method to display product details
    void display(Object obj) {

        // checking object type
        if (obj instanceof Product) {

            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {

        // creating Product object
        Product p1 = new Product("Laptop", 50000, 1, 111);

        // updating discount
        updateDiscount(15);

        // displaying product details
        p1.display(p1);
    }
}
