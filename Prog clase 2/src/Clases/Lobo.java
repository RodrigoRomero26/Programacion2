package Clases;

public class Lobo extends Canino{
    public Lobo(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    @Override
    public void hacer_ruido() {
        super.hacer_ruido();
    }

    @Override
    public void comer() {
        super.comer();
    }
}
