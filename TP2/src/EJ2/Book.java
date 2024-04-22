package EJ2;

public abstract class Book implements Loanable {
    private String title;
    private String author;
    private int yearPublication;
    private boolean loaned;

    public Book(String title, String author, int yearPublication, boolean loaned) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
        this.loaned = loaned;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public boolean isLoaned() {
        return loaned;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }

    @Override
    public void lend() {
        if (isLoaned()){
            System.out.println("El libro no esta disponible.");
        }else {
            setLoaned(true);
            System.out.println("Adquiriste el libro!");
        }
    }

    @Override
    public void returnTo() {
        if (isLoaned()){
            setLoaned(false);
            System.out.println("Devolviste el libro!");
        }else{
            System.out.println("El libro no fue prestado!");
        }
    }
}
