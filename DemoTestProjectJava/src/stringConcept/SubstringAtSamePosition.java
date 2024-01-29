package stringConcept;

public class SubstringAtSamePosition {
int count=0;
	public int stringMatch(String a, String b) {
		
		int len=Math.min(a.length(), b.length());
		
		for( int i =0; i<len-1;i++)
		{
			String sub1=a.substring(i, i+2);
			String sub2=b.substring(i, i+2);
			
				
				
				if(sub1.equals(sub2))
				{
					count=count+1;
					
				}
				
			}
		return count;
		}
		
	
	public static void main(String[] args) {


		SubstringAtSamePosition sp=new SubstringAtSamePosition();
	int co=	sp.stringMatch("aabbccdd", "abbbxxd");
	System.out.println(co);
		
	}

}
