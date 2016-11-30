
public class ReferenceBook extends LibraryBook{
	private String collection;
	public ReferenceBook(String person, String title, String ISBN, String number, String collection){
		super(person, title, ISBN,number);
		this.collection=collection;
	}
	public void checkout(String patron, String due){
		throw new IllegalStateException("cannot check out a reference book");
	}
	public void returned(){
		throw new IllegalStateException("reference book could not have been checked out -- return impossible");
	}
	public String circulationStatus(){
		return "non-circulating reference book";
	}
	public String toString(){
		return super.toString()+", collection: "+collection;
	}	
}
