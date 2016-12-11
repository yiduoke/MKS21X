import java.util.*;
import java.util.ArrayList;
public class Barcode implements Comparable<Barcode>{
	private String _zip;
	private int _checkDigit;
	private String _code;
	private ArrayList<String> _key = new ArrayList<String>(
		    Arrays.asList("||:::", 
		":::||",
		"::|:|",
		"::||:",
		":|::|",
		":|:|:",
		":||::",
		"|:::|",
		"|::|:",
		"|:|::",
		"||:::"));
	
public Barcode(String zip){
	toCode(zip);
}
public String toString(){
	return _zip+_checkDigit+"   "+_code;
}
public int compareTo(Barcode other){
	return _zip.compareTo(other._zip);
}

public String toCode(String zip){
	if (zip.length()!=5){throw new IllegalArgumentException("length of zip not 5");}
	else{
		try{
			int sum=0;
			String y = "|";
			for (int i=0; i<5; i++){
				int z=Integer.parseInt(zip.substring(i, i+1));
				y+=_key.get(z);
				sum+=z;
				}
			_zip=zip;
			_checkDigit=sum%10;
			y+=_key.get(_checkDigit);
			y+="|";
			_code=y;
			return _code;
			}
		catch(NumberFormatException e){throw new IllegalArgumentException( "zip contains non-digit");}
	}
}

public String toZip(String code){
	if (code.length()!=32){throw new IllegalArgumentException("length of code not 32");}
	else if((code.charAt(0)!='|') || (code.charAt(31)!='|')){
		throw new IllegalArgumentException("leftmost or rightmost character not '|'");
		}
	else{
		String x="";
		int sum=0;
		for (int i=1;i<22;i+=5){
			if (_key.indexOf(code.substring(i,i+5))==-1){throw new IllegalArgumentException("encoded character(s) at positions " + i + " to " + (i+5) + " invalid");}
			else{
				x+=_key.indexOf(code.substring(i,i+5));
				sum+=Integer.parseInt(x);
			}
		}
		
		int checkDigit=_key.indexOf(code.substring(26,31));
		if (checkDigit!=sum%10){throw new IllegalArgumentException("invalid checksum");}
		else{x+=checkDigit;}
		return x;
	}
}
public Barcode clone(){
	Barcode x = new Barcode(_zip);
	return x;
	}
}
