public class Player {
    private String name;
    private String position;
    private int jersey_num;

    public Player(String name, String position, int jersey_num) {
        this.name = name;
        this.position = position;
        this.jersey_num = jersey_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJersey_num() {
        return jersey_num;
    }

    public void setJersey_num(int jersey_num) {
        this.jersey_num = jersey_num;
    }
}
