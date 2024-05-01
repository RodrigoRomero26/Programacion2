package Classes;

import java.util.ArrayList;
import java.util.List;

public class Campus {
    private int fase;
    private String date;
    private String time;
    private List<Facility> facilities;
    private List<Test> tests;

    public Campus(int fase, String date, String time) {
        this.fase = fase;
        this.date = date;
        this.time = time;
        this.facilities = new ArrayList<>();
        this.tests = new ArrayList<>();
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void addFacilities(Facility facility) {
        facilities.add(facility);
    }

    public List<Test> getTests() {
        return tests;
    }

    public void addTests(Test test) {
        tests.add(test);
    }
}
