package stringConcept;

//Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
//
//
//stringX("xxHxix") → "xHix"
//stringX("abxxxcd") → "abcd"
//stringX("xabxxxcdx") → "xabcdx"

public class Program7 {

	
	
	public String stringX(String str) {
		
		
		String result="";
	
		for ( int i=0; i<str.length()-1; i++) //xxHxix
		{
			

	}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		
		Program7 p7=new Program7();
		
	String st=	p7.stringX("xxHxix");
	System.out.println(st);
		
		
	}
	
	
}
