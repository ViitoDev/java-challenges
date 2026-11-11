package challenges.class5.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter a number to display its double: ");
        calculator.number = scanner.nextDouble();
        System.out.println(calculator.showDouble());
    }
}
