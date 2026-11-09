package challenges.class3;

import java.util.Scanner;

public class VerifyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");

        if (scanner.hasNextInt()){
            int number = scanner.nextInt();

            if (number % 2 == 0){
                System.out.println("The number " + number + " is even");
            } else {
                System.out.println("The number " + number + " is odd");
            }
        } else {
            System.out.println("Invalid number.");
        }
    }
}
