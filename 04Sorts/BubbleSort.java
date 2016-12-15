public class BubbleSort{

  public static String margaretKe(){
    return "06.Ke.Yiduo"; 
  }

    public static boolean isSorted(int[] data){
	boolean a=true;
	for (int i=0; i<data.length-1; i++){
	    a=a&&(data[i]<=data[i+1]);
	    if (a==false){return a;}
	}
	return a;
    }

    public static void bubbleSort(int[] data){
	while (!(isSorted(data))){
	    for (int i=0; i<data.length-1; i++){
		if (data[i]>data[i+1]){
		    int holder=data[i];
		    data[i]=data[i+1];
		    data[i+1]=holder;
		}
	    }
	}
    }

    public static void main(String[] args){
	int[] marg={1,2,3,4,5,0};
	bubbleSort(marg);
	for (int i=0;i<marg.length;i++){
	    System.out.println(marg[i]);
	}
}
}
