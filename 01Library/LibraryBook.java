public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
	private String callNumber;
	public LibraryBook(String person, String title, String ISBN, String number){
		super(person, title, ISBN);
		callNumber=number;
	}
	public String callNumber(){
		return callNumber;
	}
	public void setCallNumber(String x){
		callNumber=x;
	}
	public abstract void checkout(String patron, String due);
	public abstract void returned();
	public abstract String circulationStatus();
	public int compareTo(LibraryBook x){
		return callNumber.compareTo(x.callNumber());
	}
	public String toString(){
		return super.toString()+", call number: "+callNumber+", circulation status: "+circulationStatus();
	}
}
