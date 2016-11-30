
public class CirculatingBook extends LibraryBook{
	private String currentHolder;
	private String dueDate;
	public CirculatingBook(String person, String title, String ISBN, String number) {
		super(person, title, ISBN, number);
	}
	public String currentHolder(){
		return currentHolder;
	}
	public String dueDate(){
		return dueDate;
	}
	public void setCurrentHolder(String x){
		currentHolder=x;
	}
	public void setDueDate(String x){
		dueDate=x;
	}
	public void checkout(String patron, String due){
		currentHolder=patron;
		dueDate=due;
	}
	public void returned(){
		currentHolder=null;
		dueDate=null;	
	}
	public String circulationStatus(){
		if (currentHolder==null && dueDate==null){return "book available on shelves";}
		else{return "current holder: "+currentHolder+", due date: "+dueDate;}
	}
	public String toString(){
		if (currentHolder == null && dueDate == null){return super.toString();}
		else{return super.toString()+", current holder: "+currentHolder+", due date: "+dueDate;}
	}
	
public static void main (String[] args){
	CirculatingBook marg = new CirculatingBook("margaret","she is gr8","232133","347761289");
	System.out.println(marg);
}
}
