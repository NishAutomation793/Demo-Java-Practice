package stringConcept;

public class Program9 {

	public String altPairs(String str) {
		  String s="";
		  for ( int i=0; i<str.length(); i++)
		  {
		    
		    if( i==0 || i==1 || i==4 || i==5 || i==8 || i==9)
		    {
		      
		      s=s+str.charAt(i);
		      
		    }
		    
		  }
		  
		  return s;
		}

	
	
	public static void main(String[] args) {

		Program9 p9= new Program9();
		String st=p9.altPairs("NishantGoel");
		System.out.println(st);
		
		
	}

}
