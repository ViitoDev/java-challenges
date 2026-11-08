package challanges.class3;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        if (number1 == number2){
            System.out.println("The number 1 is equal to the number 2");
        } else if (number1 != number2) {
            System.out.println("The number 1 is different from the number 2");
        }
    }
}
