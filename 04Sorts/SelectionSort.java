public class SelectionSort {
public static String name(){
	return "06.Ke.Margaret"; 
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
}
