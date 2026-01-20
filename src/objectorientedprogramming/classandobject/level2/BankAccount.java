/*
Program: Program to Simulate an ATM

Problem Statement:
Create a BankAccount class with attributes accountHolder, accountNumber, and balance.
Add methods for:
1. Depositing money.
2. Withdrawing money (only if sufficient balance exists).
3. Displaying the current balance.
*/

package objectorientedprogramming.classandobject.level2;

import java.util.Scanner;

public class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Creating object
        BankAccount acc = new BankAccount();

        // Taking input from user
        System.out.print("Enter account holder name: ");
        acc.accountHolder = sc.nextLine();

        System.out.print("Enter account number: ");
        acc.accountNumber = sc.nextInt();

        System.out.print("Enter initial balance: ");
        acc.balance = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter withdrawal amount: ");
        double withd = sc.nextDouble();
        acc.withdraw(withd);

        acc.displayBalance();
        sc.close();
    }
}
