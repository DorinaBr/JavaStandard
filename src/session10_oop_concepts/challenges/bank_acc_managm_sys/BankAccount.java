package session10_oop_concepts.challenges.bank_acc_managm_sys;

import java.util.UUID;

public class BankAccount {

    private String accountHolderName;
    private UUID accountNumber;
    private double balance;

    public void deposit (double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("The amount is invalid");
        }
    }

    public void withdraw(double amount){
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }else{
            System.out.println("The amount is invalid");
        }
    }

    public double checkBalance(){
        return balance;
    }

    public void getAccountDetails(){
        System.out.println("Account details: ");
        this.accountHolderName = "Tom Ford";
        this.accountNumber = UUID.randomUUID();
        System.out.println("Account holder name: " + accountHolderName + "\n" + "Account number: " + accountNumber + "\n");
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
