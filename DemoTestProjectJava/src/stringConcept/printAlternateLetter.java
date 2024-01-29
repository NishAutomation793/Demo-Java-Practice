package stringConcept;

public class printAlternateLetter {

	public String stringBits(String str) {
	
	 String result="";
	  for( int i=0; i<str.length(); i=i+2)
	  {
	    
	    result=result+str.charAt(i);
	    
	    
	  }
	  
	  return result;
	}
	
	public static void main(String[] args) {

printAlternateLetter pr=new printAlternateLetter();
String st=pr.stringBits("Nishant");
		System.out.println(st);
		
	}

}
