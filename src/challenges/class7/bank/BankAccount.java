package challenges.class7.bank;

public class BankAccount {
    private double balance;

    public void showSpecs(){
        System.out.println("Balance: " + balance);
    }

    public void deposit(double depositValue){
        balance += depositValue;
    }

    public void withdraw(double withdrawValue){
        balance -= withdrawValue;
    }
}
