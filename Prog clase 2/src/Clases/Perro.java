package Clases;

public class Perro extends Canino{
    public Perro(String foto, String comida, String localizacion, String tamano) {
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
        System.out.println("El perro fue vacunado");
    }
    public void sacar_paseo(){
        System.out.println("El perro fue sacado a pasear");
    }
}
