
public class ReferenceBook extends LibraryBook{
	private String collection;
	public ReferenceBook(String person, String title, String ISBN, String number, String collection){
		super(person, title, ISBN,number);
		this.collection=collection;
	}
	public void checkout(String patron, String due){
		System.out.println("cannot check out a reference book");
	}
	public void returned(){
		System.out.println("reference book could not have been checked out -- return impossible");
	}
	public String circulationStatus(){
		return "non-circulating reference book";
	}
	public String toString(){
		return super.toString()+", collection: "+collection;
	}
/*public static void main (String[] args){
	ReferenceBook margaret=new ReferenceBook("margaret","alphabet book","1231232","71987365123","Bauer Collection");
	ReferenceBook maggie=new ReferenceBook("maggie","Precalculus","123123122","71980","Owl Collection");
	System.out.println(margaret.compareTo(maggie));
	System.out.println("71987365123".compareTo("71980"));
}*/
}
