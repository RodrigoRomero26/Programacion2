package EJ2;

public class Main {
    public static void main(String[] args) {
        Novel novel1 = new Novel("TeruBossu", "Marcos Sapinho", 1997, false, 3);
        University university1 = new University("La teoria del canto","Sebastian Roman", 2002, false, "Canto");
        childrensBook childrensBook1 = new childrensBook("Roblox", "Clara Chavez", 1978, false, 8);
        Library library1 = new Library("PapusBook");
        library1.addBook(novel1);
        library1.addBook(university1);
        library1.addBook(childrensBook1);
        library1.booksList();
        library1.lend("Terubossu");
        library1.booksList();
        library1.returnTo("TeruBosSu");
        library1.booksList();
    }
}
