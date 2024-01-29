package stringConcept;

public class lastLettersUpperCase {
	
	public String endUp(String str) {
		 
		 if(str.length()<=3)
		  {
			  str=str.toUpperCase();
		    return str;
		    
		  }
		  int cut=str.length() - 3;
		  String subLast=str.substring(str.length()-3, str.length());
		 
		 System.out.println("SubLast String is "+subLast);
		  String subFirst=str.substring(0,cut);
		  
		  System.out.println("SubFirst String is "+subFirst);
		  
		  subLast=subLast.toUpperCase();
		
		  return (subFirst + subLast);
		  
		  
		  
		}

	
	public static void main(String[] args) {

lastLettersUpperCase lt=new lastLettersUpperCase();
String s=lt.endUp("Hi Nishan");
System.out.println(s);
		
		
	}

}
