package Clases;
public class Operator extends Employee {
    private int level;

    public Operator(String name, int level) {
        super(name);
        this.level = level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        String data;
        data = "Name:"+this.getNombre()+"\nOperator\nLevel:"+level;
        return data;
    }
    public void what_lvl(){
        switch (level){
            case 1:
                System.out.println("Regular");
                break;
            case 2:
                System.out.println ("Advanced");
                break;
            case 3:
                System.out.println ("Master");
                break;
        }
    }
}
