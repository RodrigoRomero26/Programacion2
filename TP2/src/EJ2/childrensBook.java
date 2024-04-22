package EJ2;

public class childrensBook extends Book{
    private int minimunAge;

    public childrensBook(String title, String author, int yearPublication, boolean loaned, int minimunAge) {
        super(title, author, yearPublication, loaned);
        this.minimunAge = minimunAge;
    }

    public void setMinimunAge(int minimunAge) {
        this.minimunAge = minimunAge;
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
