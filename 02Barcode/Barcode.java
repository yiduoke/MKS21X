public class BarCode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public BarCode(String zip) {
		if (zip.length()!=5){throw new IllegalArgumentException();}
	else{
		try{int a = Integer.parseInt(zip);}
		catch(NumberFormatException e){throw new IllegalArgumentException();}
	}
	for (int i=0; i<5; i++){
		int b = Integer.parseInt(zip.substring(i,i+1));
		if(b==0){}
		else if(b==1){}
		else if(b==2){}
		else if(b==3){}
		else if(b==4){}
		else if(b==5){}
		else if(b==6){}
		else if(b==7){}
		else if(b==8){}
		else if(b==9){}
		else if(b==0){}
	}
	}

// postcondition: Creates a copy of a bar code.
  public Barcode clone(BarCode x){}


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){}

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}

