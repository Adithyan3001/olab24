package newshelf;

public record ITextBook(String title, String subject) implements IBook {
    // No need for additional methods unless you want custom behavior
}
