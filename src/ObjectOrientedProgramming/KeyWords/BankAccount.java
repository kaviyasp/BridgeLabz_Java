package ObjectOrientedProgramming.KeyWords;

/*
Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
1. Static:
○ A static variable bankName is shared across all accounts.
○ A static method getTotalAccounts() to display the total number of accounts.
2. This:
○ Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
3. Final:
○ Use a final variable accountNumber to ensure it cannot be changed once assigned.
4. Instanceof:
○ Check if an account object is an instance of the BankAccount class before displaying its details.
*/

class BankAccount {

    // static variable shared by all BankAccount objects
    static String bankName = "ABC Bank";

    // static variable to count total accounts
    static int totalAccounts = 0;

    // instance variable for account holder name
    String accountHolderName;

    // final variable so account number cannot be changed
    final int accountNumber;

    // constructor to initialize account details
    BankAccount(String accountHolderName, int accountNumber) {

        // this keyword refers to current object variable
        this.accountHolderName = accountHolderName;

        // initializing final variable
        this.accountNumber = accountNumber;

        // increment account count whenever object is created
        totalAccounts++;
    }

    // static method to display total accounts
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // method to display account details
    void display(Object obj) {

        // instanceof checks whether obj belongs to BankAccount class
        if (obj instanceof BankAccount) {

            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {

        // creating BankAccount object
        BankAccount acc1 = new BankAccount("Kaviya", 101);

        // calling display method
        acc1.display(acc1);

        // calling static method
        getTotalAccounts();
    }
}
