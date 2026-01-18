package ObjectOrientedProgramming.Encapsulation;

/*
4. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

// Abstract BankAccount class
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    abstract double calculateInterest();

    public void display() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("-------------------");
    }
}

// Savings account
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

// Current account
class CurrentAccount extends BankAccount {

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.02;
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {

        BankAccount[] accounts = {
                new SavingsAccount(1, "Kaviya", 50000),
                new CurrentAccount(2, "Anu", 80000)
        };

        for (BankAccount acc : accounts) {
            acc.display();  // Polymorphism
        }
    }
}
