package stringConcept;

//Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//
//stringSplosion("Code") → "CCoCodCode"
//stringSplosion("abc") → "aababc"
//stringSplosion("ab") → "aab"

public class RepeatedString {

	String result="";
	
	public String stringSplosion(String str) {
		  
		for( int i=0; i<str.length();i++)
		{
			
			for( int j=0; j<=i; j++)
			{
				
				result=result+str.charAt(j);
				
			}
	}
		return result;
		}
	
	public static void main(String[] args) {
		RepeatedString rp=new RepeatedString();
		String st=rp.stringSplosion("Hello");
		
		System.out.println(st);
	
	}
	}

