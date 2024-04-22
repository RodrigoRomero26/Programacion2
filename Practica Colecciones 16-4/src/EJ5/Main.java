package EJ5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Ingresa 10 enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numeros " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        int count = 0;
        for (int number : numbers) {
            if (number == maxNumber) {
                count++;
            }
        }
        System.out.println("El mayor numero es: " + maxNumber);
        System.out.println("Se repite " + count + " veces.");
    }
}
