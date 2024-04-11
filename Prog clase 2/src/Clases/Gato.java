package Clases;

public class Gato extends Felino{
    public Gato(String foto, String comida, String localizacion, String tamano) {
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
    public void vacunar(){
        System.out.println("El gato fue vacunado");
    }
}
