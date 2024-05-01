package EJ1;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String course;
    private char letter;
    private Subject subject;
    private List<Student> students;

    public Group(String course, char letter, Subject subject) {
        this.course = course;
        this.letter = letter;
        this.students = new ArrayList<Student>();
        this.subject = subject;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }
}
