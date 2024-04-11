import Ejercicio1.*;
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);
        Circulo circulo1 = new Circulo(3);
        System.out.println("El area del cuadrado es = "+cuadrado1.area());
        System.out.println("El area del circulo es = "+circulo1.area());
        cuadrado1.dibujar();
        cuadrado1.rotar();
        circulo1.dibujar();
    }
}