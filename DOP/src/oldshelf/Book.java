package oldshelf;

public abstract class Book {
    String title;
    public Book(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
