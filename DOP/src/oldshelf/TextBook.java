package oldshelf;

public class TextBook extends Book {

	private final  String subject;
	public TextBook(String subject) {
		super(subject);
            this.subject = null;
	}

    public TextBook(String subject, String Title) {
        super(Title);
        this.subject = subject;
    }

	public void setTitle(String title)
	{
		super.title = title;
	}
	public String getSubject() {
		return subject;
	}
	
	@Override
	public String toString() {
		return "TextBook [subject=" + subject + "]";
	}

}
