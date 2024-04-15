package EJ4;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Door> doors;

    public House(String material) {
        this.doors = new ArrayList<>();
        doors.add(new Door(material));
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void addDoors(String material) {
        doors.add(new Door(material));
    }
}
