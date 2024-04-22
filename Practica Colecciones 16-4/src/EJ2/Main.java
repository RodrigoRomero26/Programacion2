package EJ2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Ingrese 10 enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        int biggestPrime = findbiggestPrime(numbers);
        int position = numbers.indexOf(biggestPrime);
        if (biggestPrime != -1) {
            System.out.println("El mayor número primo ingresado es: " + biggestPrime);
            System.out.println("Se encuentra en la posición: " + position);
        } else {
            System.out.println("No se encontró ningún número primo en la lista.");
        }
    }
    private static int findbiggestPrime(ArrayList<Integer> numeros) {
        int biggestPrime = -1;
        for (int num : numeros) {
            if (isPrime(num) && num > biggestPrime) {
                biggestPrime = num;
            }
        }
        return biggestPrime;
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}