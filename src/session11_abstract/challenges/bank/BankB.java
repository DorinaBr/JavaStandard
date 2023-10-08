package session11_abstract.challenges.bank;

public class BankB extends Bank{

    private int balance;

    public BankB(int balance) {
        this.balance = balance;
    }

    @Override
    int getBalance() {
        return balance;
    }
}
