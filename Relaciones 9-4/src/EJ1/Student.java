package EJ1;

public class Student {
    private String name;
    private University university;

    public Student(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void change_uni (University new_uni){
        setUniversity(new_uni);
    }
}
