package challenges.class7.bank;

public class CheckingAccount extends BankAccount{
    public void chargeMonthlyFee(double monthlyFee){
        withdraw(monthlyFee);
    }
}
