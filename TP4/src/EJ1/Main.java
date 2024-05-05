package EJ1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int randguess = 0;
        int tries = 0;
        boolean guessed = false;
        randguess = random.nextInt(1,100);
        System.out.println("Bienvenido! Intentaras adivinar un numero entre 1 y 100");
        while (!guessed) {
            System.out.println("Ingresa tu intento! Solo deben ser numeros entre 1 y 100");
            System.out.println("Intentos: "+tries);
            try {
                guess = sc.nextInt();
                if (guess >= 1 && guess <= 100) {
                    if (guess == randguess){
                        tries ++;
                        System.out.println("Adivinaste en el intento: "+tries);
                        guessed = true;
                    } else if (guess < randguess) {
                        System.out.println("El numero ingresado es menor al del objetivo");
                        tries++;
                    }else {
                        System.out.println("El numero ingresado es mayor al del objetivo");
                        tries++;
                    }
                } else {
                    System.out.println("Ingrese un número entre 1 y 100");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número válido");
                sc.nextLine();
            }
        }
    }
}

