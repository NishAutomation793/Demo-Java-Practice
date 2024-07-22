package DemoTestProgramsPractice;

/**
 * Penultimate word is the last but one word of the sentence
 */

public class FindingPenultimateWordinSentence {
	
	public static void main(String[] args) {
		
		
		String s="This is the last word";
		
		String str="";
		
		String st[]=s.split(" ");
		
		for(int i=st.length-1; i>=0; i--)
		{
			
			if(i==st.length-2)
			{
				
				str=str+st[i];
				break;
			}
		}
		
		System.out.println("Penultimate word of string "+s + " is: "+"\n"+str );
		
		
		
	}

}
