import java.util.Iterator;
import java.util.NoSuchElementException;
public class SuperArrayIterator implements Iterator<String> {
	public int state;
	public SuperArray strArr;
	public SuperArrayIterator(SuperArray x){
		state=0;
		strArr=x;
	}

	 public boolean hasNext() {
	     return !(state == strArr.size());
	    }
	

	   public String next() {
	        if(hasNext()) {
	            return strArr.get(state++);
	        } else {
	            throw new NoSuchElementException("No More Elements!");
	        }
	    }
	
	public void remove(){
	    throw new UnsupportedOperationException();
	  }
	
	/*public static void main(String[] args){
		String[] maggie={"apple","oranges","bananas"};
		SuperArray marg=new SuperArray(maggie,2);
		SuperArrayIterator bailey=new SuperArrayIterator(marg);
		while(bailey.hasNext()){
		System.out.println(bailey.next());
		}
	}*/
}
