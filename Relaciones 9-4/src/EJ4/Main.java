package EJ4;

public class Main {
    public static void main(String[] args) {
        House house1 = new House("madera");
        house1.addDoors("Metal");
        for (Door door : house1.getDoors()){
            System.out.println(door.getMaterial());
        }
    }
}
