package challanges.class2;

public class Products {
    public static void main(String[] args) {
        // Calculate the price
        double productPrice = 15;
        int quantity = 2;

        System.out.println("The final price is " + (productPrice * quantity));

        // Dollar exchange rate
        double dollarValue = 4.99;
        double reaisValue = 3;

        System.out.println(reaisValue + " Reais is equal to " + (dollarValue * reaisValue));

        // Original price
        double originalPrice = 100;
        double percentageDiscount = 0.1;
        double finalPrice = originalPrice - (originalPrice * percentageDiscount);

        System.out.println("The final price is " + finalPrice);
    }
}
