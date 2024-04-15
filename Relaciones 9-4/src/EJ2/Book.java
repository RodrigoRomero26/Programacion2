package EJ2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List persons;

    public Book(String title) {
        this.title = title;
        this.persons = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Person> getPersons() {
        return persons;
    }
    public void addperson(Person person){
        persons.add(person);
    }
}
