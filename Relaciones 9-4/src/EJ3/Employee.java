package EJ3;

public class Employee {
    private String charge;
    private String name;

    public Employee(String charge, String name) {
        this.charge = charge;
        this.name = name;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
