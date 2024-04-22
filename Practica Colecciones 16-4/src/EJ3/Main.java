package EJ3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 100; i <= 300; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
                if (primeNumbers.size() == 10) {
                    break;
                }
            }
        }
        System.out.println("Numeros primos entre 100 y 300:");
        for (int prime : primeNumbers) {
            System.out.println(prime);
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}