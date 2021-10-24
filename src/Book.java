public class Book extends LoanItem {
    private String title;

    public Book(String passedTitle) {
        this.title = passedTitle;
    }

    public void setTitle(String theTitle) {
        this.title = theTitle;
    }

    public String getTitle() {
        return this.title;
    }
}

