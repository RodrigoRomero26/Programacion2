package EJ2;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Juan");
        Employee employee2 = new Employee("Franco");

        employee1.assignSupervisor(employee2);

        System.out.println("El supervisor de " + employee1.getName() + " es: " + employee1.getSupervisorName());
    }
    }

