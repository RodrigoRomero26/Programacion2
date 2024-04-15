package EJ3;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employees;
    private String name;

    public Department( String name) {
        this.employees = new ArrayList<>();
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employee) {
        employees.add(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
