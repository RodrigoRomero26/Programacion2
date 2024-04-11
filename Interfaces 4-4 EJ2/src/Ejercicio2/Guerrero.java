package Ejercicio2;

public class Guerrero extends PersonajeBase {
    private boolean shield;

    public Guerrero(int level, char name, int health, boolean shield) {
        super(level, name, health);
        this.shield = shield;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    @Override
    public int attack() {
        return 40;
    }

    @Override
    public float defend(int dmg) {
        if (isShield()){
            return (dmg - 10);
        }else {
            return dmg;
        }

    }
}
