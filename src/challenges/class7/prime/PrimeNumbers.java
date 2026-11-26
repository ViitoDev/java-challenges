package challenges.class7.prime;

public class PrimeNumbers {
    public boolean checkPrimality(int number){
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listPrimes(int limit){
        System.out.print("Primes up to " + limit + ": ");
        for (int i = 2; i <= limit; i++) {
            if (checkPrimality(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
