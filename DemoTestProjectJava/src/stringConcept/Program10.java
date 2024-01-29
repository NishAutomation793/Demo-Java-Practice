package stringConcept;

//Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
//
//
//stringYak("yakpak") → "pak"
//stringYak("pakyak") → "pak"
//stringYak("yak123ya") → "123ya"

public class Program10 {

	String result="";
	public String stringYak(String str) {
		  
		for( int i=0; i<str.length(); i++)
		{
			
			if(str.contains("yak"))
			{
				i=i+2;
				int j=str.indexOf("yak");
				
			}
			
			result=result+str.charAt(i);
		}
		
		return result;
		
		
		
	}
	public static void main(String[] args) {

Program10 p10=new Program10();

String st=p10.stringYak("yakpaktak");
		System.out.println(st);
		
	}

}
