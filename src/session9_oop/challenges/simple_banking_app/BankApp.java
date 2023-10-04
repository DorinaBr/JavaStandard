package session9_oop.challenges.simple_banking_app;

public class BankApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.getAccountDetails();
        System.out.println("Initial balance: " + account.getBalance());
        account.setInitialDeposit(4500);
        System.out.println("\n" + "After the initial deposit the balance is: " + account.checkBalance());
        account.deposit(1759.5);
        System.out.println("After another deposit the balance is: " + account.checkBalance());
        account.withdraw(2785);
        System.out.println("The balance is: " + account.checkBalance());

    }
}
