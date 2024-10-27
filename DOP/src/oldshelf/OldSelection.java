package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {
			if (o instanceof Comic) {
				return ((Comic) o).getTitle();
			} else if (o instanceof Fiction) {
				return ((Fiction) o).getName();
			} else if (o instanceof TextBook) {
				return ((TextBook) o).getSubject();
			}
		}
		return "";
	}

	public static void main(String[] args) {
		
		TextBook t = new TextBook("ld","borans book");
		System.out.println(getAgeOrTitle(t));
		Fiction f = new Fiction("ld","boran",FictionType.Comedy);
		System.out.println(getAgeOrTitle(f));
		Comic c = new Comic("ld", 12);
		System.out.println(getAgeOrTitle(c));

		
	}
}
