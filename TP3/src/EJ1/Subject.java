package EJ1;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int classroom;
    private String time;
    private String name;
    private Group group;
    private Teacher teacher;

    public Subject(int classroom, String time, String name, Teacher teacher) {
        this.classroom = classroom;
        this.time = time;
        this.name = name;
        this.teacher = teacher;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
