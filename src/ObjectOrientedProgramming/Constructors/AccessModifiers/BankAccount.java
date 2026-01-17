/*
Problem 3: Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.
*/

package ObjectOrientedProgramming.Constructors.AccessModifiers;

class BankAccount {

    public long accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter for private balance
    public double getBalance() {
        return balance;
    }

    // Public setter for private balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(123456789, "Anu", 25000);
        sa.displayDetails();
    }
}

