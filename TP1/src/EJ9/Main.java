package EJ9;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del círculo: " + circulo.calcArea());
        System.out.println("Perímetro del círculo: " + circulo.calcPerimeter());
        System.out.println("Área del rectángulo: " + rectangulo.calcArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcPerimeter());
    }
}

