package EJ9;

class Rectangulo extends FiguraGeometrica {
    private double longitud;
    private double anchura;

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    @Override
    double calcArea() {
        return longitud * anchura;
    }

    @Override
    double calcPerimeter() {
        return 2 * (longitud + anchura);
    }
}