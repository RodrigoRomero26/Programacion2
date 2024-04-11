package Clases;

public abstract class Canino extends Animal{
    public Canino(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    @Override
    public void rugir() {
        super.rugir();
    }
}
