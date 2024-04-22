package EJ1;
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
        int mayor = numbers.get(0);
        int pos = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > mayor) {
                mayor = numbers.get(i);
                pos = i;
            }
        }
        System.out.println("El mayor número ingresado es: " + mayor);
        System.out.println("Se encuentra en la posición: " + pos);
    }
}