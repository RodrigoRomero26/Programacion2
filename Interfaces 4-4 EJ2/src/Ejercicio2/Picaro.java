package Ejercicio2;

public class Picaro extends PersonajeBase{
    private boolean daga;

    public Picaro(int level, char name, int health, boolean daga) {
        super(level, name, health);
        this.daga = daga;
    }

    public boolean isDaga() {
        return daga;
    }

    public void setDaga(boolean daga) {
        this.daga = daga;
    }

    @Override
    public int attack() {
        if (isDaga()){
            return 30;
        }else {
            return 20;
        }
    }

    @Override
    public float defend(int dmg) {
        return dmg;
    }
}
