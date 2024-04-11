package Ejercicio2;

public class Mago extends PersonajeBase{
    private int mana;

    public Mago(int level, char name, int health, int mana) {
        super(level, name, health);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int attack() {
        if (mana > 6){
            return 30;
        }else {
            return 20;
        }
    }

    @Override
    public float defend(int dmg) {
        if (mana >= 9){
            return dmg - 10;
        }else {
            return dmg;
        }
    }
}
