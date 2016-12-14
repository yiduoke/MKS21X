public class SelectionSort {
public static void sort(int[] x){
	for (int i=0; i<x.length; i++){
		int a=x[i];
		int b=i;
		for (int w=i+1; w<x.length;w++){
			if (x[w]<a){a=x[w]; b=w;}
			if (w==x.length-1){x[b]=x[i]; x[i]=a;}
		}
	}
}
public static void main(String[] args){
	int[] marg={5,6,1,2,10,1};
	sort(marg);
	for (int i=0; i<marg.length; i++){
	System.out.println(marg[i]);
	}
}
}
