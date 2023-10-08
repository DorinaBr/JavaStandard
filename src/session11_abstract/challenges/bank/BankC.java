package session11_abstract.challenges.bank;

public class BankC extends Bank{

    private int balance;

    public BankC(int balance) {
        this.balance = balance;
    }

    @Override
    int getBalance() {
        return balance;
    }
}
