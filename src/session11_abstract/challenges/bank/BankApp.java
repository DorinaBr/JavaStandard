package session11_abstract.challenges.bank;

public class BankApp {

    public static void main(String[] args) {
        BankA bankA = new BankA(100);
        System.out.println("Bank A balance is: " + bankA.getBalance());

        BankB bankB = new BankB(150);
        System.out.println("Bank B balance is: " + bankB.getBalance());

        BankC bankC = new BankC(200);
        System.out.println("Bank C balance is: " + bankC.getBalance());
    }
}
