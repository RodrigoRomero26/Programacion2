package EJ2;

public class Novel extends Book{
    private int pagCount;

    public Novel(String title, String author, int yearPublication, boolean loaned, int pagCount) {
        super(title, author, yearPublication, loaned);
        this.pagCount = pagCount;
    }

    public int getPagCount() {
        return pagCount;
    }

    public void setPagCount(int pagCount) {
        this.pagCount = pagCount;
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
