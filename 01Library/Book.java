
public class Book {
	private String author;
	private String title;
	private String ISBN;
	public Book(){
		author="Margaret Ke";
		title="Margaret Ke is the greatest";
		ISBN="7273681864";
	}
	public Book(String person, String title, String ISBN){
		author=person;
		this.title=title;
		this.ISBN=ISBN;
	}
	public String author(){
		return author;
	}
	public String title(){
		return title;
	}
	public String ISBN(){
		return ISBN;
	}
	public void setAuthor(String x){
		author=x;
	}
	public void setTitle(String x){
		title=x;
	}
	public void setISBN(String x){
		ISBN=x;
	}
	public String toString(){
		return "title: "+title+", author: "+author+", ISBN: "+ISBN;
	}
}
