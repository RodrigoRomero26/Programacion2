package EJ8;

public class Worker extends Employee{
    private int area;

    public Worker(String name, int age, float salary, int area) {
        super(name, age, salary);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public void check_in() {
        super.check_in();
    }
    public void produce(){
        System.out.println("El empleado esta produciendo");
    }
}
