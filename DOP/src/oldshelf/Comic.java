package oldshelf;

public class Comic extends Book {

	//private String Title;
	private final int ageOfMainCharacter;
	public Comic(String title,int age){
		super(title);
		this.ageOfMainCharacter=age;
	}
	public String getTitle(){
		return super.title;
	}
	public int getage(){
		return ageOfMainCharacter;
	}
	public void setTitle(String title){
		super.title = title;
	}
	
	@Override
	public String toString() {
		return "Comic [Title=" + super.title + ", ageOfMainCharacter=" + ageOfMainCharacter + "]";
	}
	
	@Override
	public int hashCode() {
		int result = super.title != null ? super.title.hashCode() : 0;
        result = 31 * result + ageOfMainCharacter;
        return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)return true;
		if(o == null || getClass() != o.getClass())return false;
		Comic comic = (Comic) o;
		if(ageOfMainCharacter != comic.getage())return false;
		return super.title != null ? super.title.equals(comic.getTitle()) : comic.getTitle() == null;
	}
}
