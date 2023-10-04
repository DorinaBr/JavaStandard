package session10_oop_concepts.challenges.bank_acc_managm_sys;

public class BankApp {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.getAccountDetails();
        System.out.println("Initial balance: " + account.checkBalance());
        account.deposit(500.55);
        account.withdraw(250.25);
        System.out.println("Final balance: " + account.checkBalance());

        System.out.println(" ");

        AnotherBankAccount anotherBankAccount = new AnotherBankAccount();
        anotherBankAccount.getAccountDetails();
        System.out.println("Initial balance: " + anotherBankAccount.checkBalance());
        anotherBankAccount.deposit(4000);
        anotherBankAccount.withdraw(1500.50);
        anotherBankAccount.transferFunds(account, 2000);
        System.out.println("Final balance: " + anotherBankAccount.checkBalance());

    }
}
