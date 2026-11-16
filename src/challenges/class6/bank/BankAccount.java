package challenges.class6.bank;

public class BankAccount {
    private int accountNumber;
    private double balance;
    public String owner;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showSpecs(){
        System.out.println(owner);
        System.out.println(balance);
        System.out.println(accountNumber);
    }
}