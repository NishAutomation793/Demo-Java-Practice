package stringConcept;

//Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
//
//
//last2("hixxhi") → 1
//last2("xaxxaxaxx") → 1
//last2("axxxaaxx") → 2

public class countRepeatedSubstring {
	int count =0;
	public int last2(String str) {
		
		String ends=str.substring(str.length()-2, str.length());
		System.out.println("Substring ends value is " +ends);
		for ( int i=0; i<str.length()-2; i++)
		{
			String sub = str.substring(i,i+2);
			
			if(sub.equals(ends))
			{
				count=count+1;
				
			}
			
		}
		return count;
	}
	

	public static void main(String[] args) {

		countRepeatedSubstring co=new countRepeatedSubstring();
	int ct=	co.last2("IshNishsh");
		System.out.println(ct);
		
	}

}
