package challenges.class7.prime;

public class PrimeChecker extends PrimeNumbers {
    public void checkIfPrime(int number){
        if (checkPrimality(number)) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
