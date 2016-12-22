public class Sorts{

  public static String margaretKe(){
    return "06.Ke.Yiduo"; 
  }

public static void selectionSort(int[] x){
	for (int i=0; i<x.length; i++){
		int a=x[i];
		int b=i;
		for (int w=i+1; w<x.length;w++){
			if (x[w]<a){a=x[w]; b=w;}
			if (w==x.length-1){x[b]=x[i]; x[i]=a;}
		}
	}
}

   public static void insertionSort(int[] data){
    	for (int i=0; i<data.length-1; i++){
    		for (int m=i; m>-1; m--){
       			int x=data[data.length-1];
    			if (x>=data[m]){
    				for (int a=data.length-1;a>m+1;a--){
    					data[a]=data[a-1];
    				}
    				data[m+1]=x;
    				m=-1;
    			}
    			else if(m==0){
    				for (int a=data.length-1;a>0;a--){
    					data[a]=data[a-1];
    				}
    					data[0]=x;
    			}
    		}
    	}
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

}
