package newshelf;
public sealed interface IBook permits IComic, IFiction, ITextBook {
    //String title();
}
