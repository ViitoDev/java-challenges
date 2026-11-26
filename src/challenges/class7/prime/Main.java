package challenges.class7.prime;

public class Main {
    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        checker.checkIfPrime(7);
        checker.checkIfPrime(10);
        checker.listPrimes(30);

        PrimeGenerator generator = new PrimeGenerator();
        System.out.println("Next prime after 10: " + generator.generateNextPrime(10));
        System.out.println("Next prime after 13: " + generator.generateNextPrime(13));
    }
}
