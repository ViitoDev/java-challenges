package challanges.class3;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a option: ");
        System.out.println("1. Calculate the area of a square");
        System.out.println("2. Calculate the area of a circle");
        int option = scanner.nextInt();

        if (option == 1){
            System.out.println("Enter the squareArea of the square: ");
            int side = scanner.nextInt();

            int squareArea = side * side;
            System.out.println("The area of the square with squareArea " + side + " is " + squareArea);
        } else if (option == 2) {
            System.out.println("Enter the base of the triangle: ");
            int base = scanner.nextInt();
            System.out.println("Enter the height of the triangle");
            double height = scanner.nextDouble();

            double triangleArea = (base * height) / 2;
            System.out.println("The area of the triangle is " + triangleArea);
        }
    }
}