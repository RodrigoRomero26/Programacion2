package Clases;
public abstract class Employee {
    private String name;

    public Employee(String nombre) {
        this.name = nombre;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    @Override
    public String toString() {
        String data;
        data = "Name:"+this.name;
        return data;
    }

}
