package Clases;

public abstract class Animal {
    private String foto;
    private String comida;
    private String localizacion;
    private String tamano;

    public Animal(String foto, String comida, String localizacion, String tamano) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamano = tamano;
    }

    public String getFoto() {
        return foto;
    }

    public String getComida() {
        return comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void hacer_ruido(){
        System.out.println("");
    }
    public void comer(){
        System.out.println("");
    }
    public void dormir(){
        System.out.println("");
    }
    public void rugir(){
        System.out.println("");
    }
}
