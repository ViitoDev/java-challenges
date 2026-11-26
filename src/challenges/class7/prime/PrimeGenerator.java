package challenges.class7.prime;

public class PrimeGenerator extends PrimeNumbers {
    public int generateNextPrime(int number){
        int next = number + 1;
        while (!checkPrimality(next)) {
            next++;
        }
        return next;
    }
}
