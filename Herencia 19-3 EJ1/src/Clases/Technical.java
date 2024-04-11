package Clases;

public class Technical extends Operator {
    private int pc_id;

    public Technical(String nombre, int level, int pc_id) {
        super(nombre, level);
        this.pc_id = pc_id;
    }

    public int getPc_id() {
        return pc_id;
    }

    public void setPc_id(int pc_id) {
        this.pc_id = pc_id;
    }

    @Override
    public String toString() {
        String data;
        data = "Name:"+this.getNombre()+"\nTechnical\nPC:"+pc_id;
        return data;
    }
    private void what_leng(){
        if (pc_id>=0 && pc_id<=10){
            System.out.println("Java Technical");
        } else if (pc_id == 11) {
            System.out.println("Python Technical");
        }else {
            System.out.println("HTML Techical");
        }
    }
}
