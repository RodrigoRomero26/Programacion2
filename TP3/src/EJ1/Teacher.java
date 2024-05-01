package EJ1;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private String dpto;
    private List<Subject> imparts;

    public Teacher(int dni, String name, String dpto) {
        super(dni, name);
        this.dpto = dpto;
        this.imparts = new ArrayList<Subject>();
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public List<Subject> getImparts() {
        return imparts;
    }

    public void addImparts(Subject subject) {
        imparts.add(subject);
    }

    @Override
    public int getDni() {
        return super.getDni();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
