package EJ2;

public class University extends Book{
    private String subject;

    public University(String title, String author, int yearPublication, boolean loaned, String subject) {
        super(title, author, yearPublication, loaned);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void lend() {
        super.lend();
    }

    @Override
    public void returnTo() {
        super.returnTo();
    }
}
