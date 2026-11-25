package challenges.class7.bank;

public class Main {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();

        account.deposit(1000);
        account.showSpecs();

        account.withdraw(100);
        account.showSpecs();

        account.chargeMonthlyFee(25);
        account.showSpecs();
    }
}
