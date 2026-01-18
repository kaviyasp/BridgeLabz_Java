package ObjectOrientedProgramming.Inheritance.HierarchicalInheritance;

/*
Hierarchical Inheritance
Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
*/

// Superclass
class BankAccount {
    int accountNumber;
    double balance;

    // Constructor to initialize account details
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

// CheckingAccount subclass
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

// FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {
    int depositPeriod; // in months

    FixedDepositAccount(int accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

// Main class
public class BankAccountTest {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, 50000, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount(103, 100000, 24);

        sa.displayAccountType();
        ca.displayAccountType();
        fd.displayAccountType();
    }
}
