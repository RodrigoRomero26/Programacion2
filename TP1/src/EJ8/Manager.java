package EJ8;

public class Manager extends Employee{
    private int dpto;

    public Manager(String name, int age, float salary, int dpto) {
        super(name, age, salary);
        this.dpto = dpto;
    }

    public int getDpto() {
        return dpto;
    }

    public void setDpto(int dpto) {
        this.dpto = dpto;
    }
    public void create_act(){
        System.out.println("El gerente:"+getName()+" organizo actividades en el departamento:"+getDpto());
    }

    @Override
    public void check_in() {
        super.check_in();
    }
}
