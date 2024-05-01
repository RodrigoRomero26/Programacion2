package EJ2;

public class Employee {
    private String name;
    private Employee supervisor;
    public Employee(String name) {
        this.name = name;
        this.supervisor = null;
    }
    public void assignSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisorName() {
        if (supervisor != null) {
            return supervisor.getName();
        } else {
            return "Sin supervisor";
        }
    }

    public String getName() {
        return name;
    }
}
