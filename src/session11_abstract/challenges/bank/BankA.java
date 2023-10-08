package session11_abstract.challenges.bank;

public class BankA extends Bank{

    private int balance;

    public BankA(int balance) {
        this.balance = balance;
    }

    @Override
    int getBalance() {
        return balance;
    }
}
