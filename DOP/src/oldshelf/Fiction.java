package oldshelf;

public class Fiction extends Book {

	private String name;
	private final FictionType type;
	public Fiction(String title ,String name, FictionType typeo) {
		super(title);
		this.name = name;
		this.type = typeo;
	}
	public String getName() {
		return name;
	}
	public FictionType getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
}
