package challenges.class6.product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setPrice(100);
        product1.setName("Apple");
        System.out.println("Price without discount: " + product1.getPrice());

        product1.applyDiscount(25);
        System.out.println("Price with discount: " + product1.getPrice());
    }
}