package EJ3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Department> departments;
    private String name;

    public Company( String name) {
        this.departments = new ArrayList<>();
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
