package EJ3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base;
        float height;
        float area;
        boolean aux;
        System.out.println("Calculador de area de triangulo");
        while (true){
            try {
                System.out.println("Ingrese la base");
                base = sc.nextFloat();
                System.out.println("Ingrese la altura");
                height = sc.nextFloat();
                break;
            }catch (InputMismatchException e){
                System.out.println("Ingrese valores validos");
                sc.nextLine();
            }
        }
        area = ((base*height)/2);
        System.out.println("El area de este triangulo es "+base);
    }
}
