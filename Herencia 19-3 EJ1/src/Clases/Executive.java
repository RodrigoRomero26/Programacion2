package Clases;

public class Executive extends Employee {
    private String area;
    private int zone;


    public Executive(String nombre, String area, int zone) {
        super(nombre);
        this.area = area;
        this.zone = zone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        String data;
        data = "Name:"+this.getNombre()+"\nExecutive\nArea:"+area;
        return data;
    }
    public void what_area(){
        switch (zone){
            case 1:
                System.out.println("PC zone");
                break;
            case 2:
                System.out.println("Machines zone");
                break;
        }
    }
}
