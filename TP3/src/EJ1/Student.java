package EJ1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<Group> belongstoGroup;

    public Student(int dni, String name) {
        super(dni, name);
        this.belongstoGroup = new ArrayList<Group>();
    }

    public List<Group> getBelongstoGroup() {
        return belongstoGroup;
    }

    public void addBelongstoGroup(Group group) {
        belongstoGroup.add(group);
    }
}
