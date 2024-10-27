package newshelf;

public record IFiction(String title, String name, IFictionType type) implements IBook {
    // No need for additional methods unless you want custom behavior
}
