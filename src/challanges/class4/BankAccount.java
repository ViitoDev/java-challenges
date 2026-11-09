package challanges.class4;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean application = true;

        while (application){
            double balance = 0;

            System.out.println("-=-=-=-=-=-=-=-(@)-=-=-=-=-=-=-=-");
            System.out.println("Name         : João Barros");
            System.out.println("Account type : Checking Account");
            System.out.println("Balance      : " + balance);
            System.out.println("-=-=-=-=-=-=-=-(@)-=-=-=-=-=-=-=-");
            System.out.println("Choose an option :");
            System.out.println("1. Check balance");
            System.out.println("2. Receive an amount");
            System.out.println("3. Transfer an amount");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
        }
    }
}
