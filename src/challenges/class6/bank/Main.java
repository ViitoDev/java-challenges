package challenges.class6.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.owner = "Victor";
        bankAccount.setBalance(0);
        bankAccount.setAccountNumber(32033131);
        bankAccount.showSpecs();
    }
}
