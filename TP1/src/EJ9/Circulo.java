package EJ9;

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcArea() {
        return Math.PI * radio * radio;
    }

    @Override
    double calcPerimeter() {
        return 2 * Math.PI * radio;
    }
}