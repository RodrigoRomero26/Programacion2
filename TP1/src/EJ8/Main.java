package EJ8;
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Marcos", 24, 10000,1);
        Worker worker = new Worker("Clara", 21, 7000, 5);
        manager.check_in();
        worker.check_in();
        manager.create_act();
        System.out.println("El area del empleado "+worker.getName()+" es "+worker.getArea());
    }
}
