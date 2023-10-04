package session9_oop.challenges.simple_banking_app;

import java.util.UUID;

public class BankAccount {

    private UUID accountID;
    private String firstName;
    private String lastName;
    private double balance;
    private final double initialDeposit = 4000;


    public void setInitialDeposit(double initialDeposit) {
        balance += initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("The amount is invalid.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("The amount is invalid.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void getAccountDetails() {
        System.out.println("Account details: ");
        this.accountID = UUID.randomUUID();
        this.firstName = "Alice";
        this.lastName = "Queen";
        System.out.println("Account number: " + accountID + "\n" + "Account holder name: " + (firstName.concat(" ").concat(lastName)));
    }

    public UUID getAccountID() {
        return accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }
}
