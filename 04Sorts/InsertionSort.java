public class InsertionSort{
    public static String name(){return "06.Ke.Yiduo";}

    public void add(int[] data, int index, int  element){
	  int[] temp=new int[data.length+1];
	  for (int i=0; i<data.length+1; i++){
		  if (i==index){temp[i]=element;}
		  else if(i<index){temp[i]=data[i];}
		  else{temp[i]=data[i-1];}  	
	  }
	  data=temp;
  }
    public void remove(int[]data, int index){
	  int[] x=data[index];
	  for (int i=0; i<data.length-1; i++){
		  if(i<index){data[i]=data[i];}
		  else {data[i]=data[i+1];}
	  }
  }

    public static void insertionSort(int[] data){
	for (int i=data.length-1; i>=0; i--){
	    int x=0;
	    for (int a=i-1;a>=0;a--){
		if (a==0){add(data,0,data[i];}
	    }
	}
    }
}