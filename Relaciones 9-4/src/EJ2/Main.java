package EJ2;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Valentin");
        Person person2 = new Person("Teru");
        Book book1 = new Book("El libro de la selva");
        Book book2 = new Book("Monster Hunter");
        person1.addBook(book1);
        person1.addBook(book2);
        person2.addBook(book1);
        System.out.println("Libros de "+person1.getName());
        for (Book book : person1.getBooks()){
            System.out.println(book.getTitle());
        }
        System.out.println("Libros de "+person2.getName());
        for (Book book : person2.getBooks()){
            System.out.println(book.getTitle());
        }
        System.out.println("Personas que poseen el libro "+book1.getTitle());

        for (Person person : book1.getPersons()){
            System.out.println(person.getName());
        }
    }
}
