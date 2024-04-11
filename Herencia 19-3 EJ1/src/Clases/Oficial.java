package Clases;
public class Oficial extends Operator {
    private int office_num;

    public Oficial(String nombre, int level, int office_num) {
        super(nombre, level);
        this.office_num = office_num;
    }

    public int getOffice_num() {
        return office_num;
    }

    public void setOffice_num(int office_num) {
        this.office_num = office_num;
    }

    @Override
    public String toString() {
        String data;
        data = "Name:"+this.getNombre()+"\nOficial\nOffice:"+office_num;
        return data;
    }
    public void what_floor(){
        if (office_num>0&&office_num<=5){
            System.out.println("1st Floor");
        }else {
            System.out.println("2nd Floor");
        }
    }
}
