import java.util.Iterator;

public class SuperArray implements Iterable<String>{
  private String[] data;
  private int size;
  
  //0
  //constructor make an empty superArray should make size 0, 
  //but the data capacity 10.
  
  public SuperArray(){
	  data= new String[10];
	  size=0;
  }
  
  public SuperArray(int capacity){
	  data=new String[capacity];
	  size=0;
  }
  
  public SuperArray(String[] array, int size){
	  data=array;
	  this.size=size;
  }
  
  public int length(){
	  return data.length;
  }

  public int size(){
    return size;
  }

  public String get(int index){
	  return data[index];
  }
  
  public String[] array(){
	  return data;
  }
  //1
/**add the value n to the next available slot in the superArray.
 *this will change the size. This function should always work
 *And will resize the SuperArray if needed.*/
  
  public void duplicate(String[] array, int size){
	  data=array;
	  this.size=size;
  }
  public void add(String n){
	  if (size==data.length){
		  grow();
		  data[size]=n;
	  }
	  else{
		  data[size]=n;
	  }
	  size++;
  }

  //2
/**Resize the data by making a new array, then copy over elements. Use this as your data.
*/

  private void grow(){
	  String[] temp=new String[data.length*2];
	  for (int i=0; i<size; i++){
		  temp[i]=data[i];
	  }
	  data=temp;
  }

  //3
   /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
    *commas between... square bracket start/end and no comma at end.*/
  public String toString(){
	  String x="[ ";
	  for (int i=0; i<size; i++){
		  if (i==size-1){
			  x+=data[i]+"]";
		  }
		  else{
			  x+=data[i]+", ";
		  }
	  }
	  return x;
  }

  //4
    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
    *(capacity is 10, but only 6 are used)
    *commas between... square bracket start/end and no comma at end.
    *unused slots should be printed as _ (underscores) */
  public String toStringDebug(){
	  String x="[ ";
	  if (data.length==size){
		  return data.toString()+"]";
	  }
	  else{
		  for (int i=0; i<size; i++){
				  x+=data[i]+", ";
		  }
		  for (int i=size; i<data.length; i++){
			  if (i==data.length-1){x+="_]";}
			  else{x+="_, ";}
		  }
	  return x;
	  }
}
  public void clear(){
	  size=0;
  }
  
  public boolean isEmpty(){
	  return size==0;
  }
  
  public String set(int index, String element){
	  String x = data[index];
	  for (int i=0; i<data.length; i++){
		  if (i==index){data[i]=element;}
	  }
	  return x;
  }
  
  public void add(int index, String element){
	  String[] temp=new String[data.length+1];
	  for (int i=0; i<data.length+1; i++){
		  if (i==index){temp[i]=element;}
		  else if(i<index){temp[i]=data[i];}
		  else{temp[i]=data[i-1];}  	
	  }
	  data=temp;
	  size++;
  }
  
  public String remove(int index){
	  String x=data[index];
	  for (int i=0; i<data.length-1; i++){
		  if(i<index){data[i]=data[i];}
		  else {data[i]=data[i+1];}
	  }
	  size--;
	  return x;
  }
  
  public String[] toArray(){
	  String[] temp=new String[data.length];
	  for (int i=0; i<size; i++){
		  temp[i]=data[i];
	  }
	  return temp;
  }
  
  public int indexOf(String i){
	  for (int x=0; x<size; x++){
		  if (data[x].equals(i)){return x;}
	  }
	  return -1;
  }
  
  public int lastIndexOf(String i){
	  for (int x=size-1; x>=0; x--){
		  if (data[x].equals(i)){return x;}
	  }
	  return -1;
  }
  
  public Iterator<String> iterator() {
	  return new SuperArrayIterator(this);
  }
  
  public static void main(String[] args){
	  SuperArray margaret = new SuperArray();
	  margaret.add("apple");
	  margaret.add("banana");
	  System.out.println(margaret.size());
	  System.out.println(margaret.toString());
	  margaret.add("citrus");
	  margaret.add("delicious");
	  margaret.add("banana");
	  margaret.add("fun");
	  margaret.grow();
	  System.out.println(margaret.toStringDebug());
	  System.out.println(margaret.isEmpty());
	  System.out.println(margaret.toArray());
	  System.out.println(margaret.set(2,"cider"));
	  System.out.println(margaret.toString());
	  margaret.add(3,"aa");
	  System.out.println(margaret.toString());
	  System.out.println(margaret.indexOf("aa"));
	  System.out.println(margaret.toStringDebug());
	  System.out.println(margaret.lastIndexOf("banana"));
	  System.out.println(margaret);
	  System.out.println(margaret.remove(3));
	  System.out.println(margaret);
	  System.out.println(margaret.remove(0));
	  System.out.println(margaret.get(2));
  }
  
}

