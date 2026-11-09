package challenges.class4;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean application = true;
        double balance = 0;

        while (application){
            System.out.println("-=-=-=-=-=-=-=-(@)-=-=-=-=-=-=-=-");
            System.out.println("Choose an option :");
            System.out.println("1. Check balance");
            System.out.println("2. Receive an amount");
            System.out.println("3. Transfer an amount");
            System.out.println("4. Exit");
            int option = scanner.nextInt();

            if (option == 1){
                System.out.println("\n-=-=-=-=-=-=-=-(@)-=-=-=-=-=-=-=-");
                System.out.println("Name         : João Barros");
                System.out.println("Account type : Checking Account");
                System.out.println("Balance      : " + balance);
                System.out.println("-=-=-=-=-=-=-=-(@)-=-=-=-=-=-=-=-\n");
            } else if (option == 2) {
                System.out.println("\n-=-=-=-=-=-=-=-(@)-=-=-=-=-=-=-=-");
                System.out.println("Enter the value to receive: ");
                balance += scanner.nextDouble();
                System.out.println("-=-=-=-=-=-=-=-(@)-=-=-=-=-=-=-=-\n");
            } else if (option == 3) {
                System.out.println("\n-=-=-=-=-=-=-=-(@)-=-=-=-=-=-=-=-");
                System.out.println("Enter the value to transfer: ");
                double transferValue = scanner.nextDouble();
                if ((balance - transferValue) < 0){
                    System.out.println("Invalid transfer : Without balance");
                } else {
                    System.out.println("You transferred " + transferValue + " dollars.");
                    balance -= transferValue;
                }
                System.out.println("-=-=-=-=-=-=-=-(@)-=-=-=-=-=-=-=-\n");
            } else if (option == 4) {
                application = false;
            }
        }
    }
}
