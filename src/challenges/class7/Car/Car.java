package challenges.class7.Car;

public class Car {
    private String modelName;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setAveragePrices(double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    public double getLowestPrice() {
        return Math.min(priceYear1, Math.min(priceYear2, priceYear3));
    }

    public double getHighestPrice() {
        return Math.max(priceYear1, Math.max(priceYear2, priceYear3));
    }

    public void showSpecs() {
        System.out.println("Model: " + modelName);
        System.out.println("Year 1 average price: " + priceYear1);
        System.out.println("Year 2 average price: " + priceYear2);
        System.out.println("Year 3 average price: " + priceYear3);
        System.out.println("Lowest price: " + getLowestPrice());
        System.out.println("Highest price: " + getHighestPrice());
    }
}
