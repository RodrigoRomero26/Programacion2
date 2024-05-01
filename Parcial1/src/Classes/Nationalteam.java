package Classes;
import java.util.ArrayList;
import java.util.List;

public class Nationalteam {
    private String color;
    private String pais;
    private List<Athlete> athletes;

    public Nationalteam(String color, String pais) {
        this.color = color;
        this.pais = pais;
        this.athletes = new ArrayList<Athlete>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void addAthletes(Athlete athlete) {
        athletes.add(athlete);
    }
}
