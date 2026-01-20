package objectorientedprogramming.objectmodeling;

/*
Problem 2: Bank and Account Holders (Association)
● Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
● Tasks:
○ Define a Bank class and a Customer class.
○ Use an association relationship to show that each customer has an account in a bank.
○ Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
● Goal: Illustrate association by setting up a relationship between customers and the bank.
*/

class Bank {
    String bankName;

    // Constructor
    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Method to open an account for a customer
    void openAccount(Customer customer, double balance) {
        customer.balance = balance;
        customer.bank = this;
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }
}

class Customer {
    String name;
    double balance;
    Bank bank;

    // Constructor
    Customer(String name) {
        this.name = name;
    }

    // Method to view account balance
    void viewBalance() {
        System.out.println(name + "'s balance in " + bank.bankName + " is: " + balance);
    }
}

public class BankAssociationDemo {
    public static void main(String[] args) {

        // Creating bank object
        Bank bank = new Bank("State Bank");

        // Creating customer object
        Customer customer = new Customer("Kaviya");

        // Opening account for customer
        bank.openAccount(customer, 5000);

        // Customer checking balance
        customer.viewBalance();
    }
}
