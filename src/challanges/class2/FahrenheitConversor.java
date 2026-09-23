package challanges.class2;

public class FahrenheitConversor {
    public static void main(String[] args) {
        int celsius = 32;
        double farenheit = (celsius * 1.8) + 32;

        System.out.printf("""
                Celsius = %d
                fahrenheit = %.2f
                """, celsius, farenheit);
    }
}
