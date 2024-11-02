package newshelf;


public class NewSelection {

    // Implementing the getAgeOrTitle method
    public static String getAgeOrTitle(Object o) {
        // if (o instanceof IComic comic) {
        //     return comic.title();
        // } else if (o instanceof IFiction fiction) {
        //     return fiction.name();
        // } else if (o instanceof ITextBook textBook) {
        //     return textBook.subject();
        // } else {
        //     return "";
        // }
        return switch (o) {
            case IComic comic -> comic.title();
            case IFiction fiction -> fiction.name();
            case ITextBook textBook -> textBook.subject();
            default -> "";
        };
    }

    public static void main(String[] args) {
        // Testing the new implementation
        IComic comic = new IComic("Superman", 25);
        IFiction fiction = new IFiction("Dune", "Paul Atreides", IFictionType.SCIENCE_FICTION);
        ITextBook textBook = new ITextBook("Mathematics", "Algebra");

        System.out.println(getAgeOrTitle(comic));       // Output: Superman
        System.out.println(getAgeOrTitle(fiction));     // Output: Paul Atreides
        System.out.println(getAgeOrTitle(textBook));    // Output: Algebra

        // Test with a non-Book object
        System.out.println(getAgeOrTitle("Not a book")); // Output: (empty string)
    }
}
