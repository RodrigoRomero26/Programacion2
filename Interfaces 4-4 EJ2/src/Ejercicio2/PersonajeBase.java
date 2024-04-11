package Ejercicio2;

public abstract class PersonajeBase implements Personaje {
    private int level;
    private String name;
    private int health;

    public PersonajeBase(int level, String name, int health) {
        this.level = level;
        this.name = name;
        this.health = health;
    }
}
