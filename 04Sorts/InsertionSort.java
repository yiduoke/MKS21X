public class InsertionSort{
	public static String name(){
	    return "06.Ke.Margaret"; 
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
}

