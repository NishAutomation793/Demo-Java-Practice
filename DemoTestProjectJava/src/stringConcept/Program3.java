package stringConcept;

public class Program3 {

	String s="";
	public String NthCharacter(String str, int n)
	{
		for ( int i=0; i<str.length(); i=i+n)
		{
			
			s=s+str.charAt(i);
			
			
		}
	
		return s;
	}
	
	public static void main(String[] args) {
		
		Program3 pr=new Program3();
	String st=	pr.NthCharacter("Nishant", 3);
		
		System.out.println(st);
		
	}
	
	
}
