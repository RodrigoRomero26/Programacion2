package EJ4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Ingresa 10 enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        ArrayList<Integer> positionsEndingIn4 = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num % 10 == 4) {
                positionsEndingIn4.add(i);
            }
        }
        if (!positionsEndingIn4.isEmpty()) {
            System.out.println("Posicion de numeros terminados en 4:");
            for (int position : positionsEndingIn4) {
                System.out.println(position);
            }
        } else {
            System.out.println("No se encontraron numeros terminados en 4");
        }
    }
}
