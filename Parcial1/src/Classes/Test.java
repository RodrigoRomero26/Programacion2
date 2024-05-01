package Classes;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private int code;
    private String title;
    private List<Athlete>athletes;

    public Test(int code, String title) {
        this.code = code;
        this.title = title;
        this.athletes = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void addAthletes(Athlete athlete) {
        athletes.add(athlete);
    }
}
