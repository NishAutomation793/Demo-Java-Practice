package DemoTestProgramsPractice;

public class ReverseEveryWordInString {

	public static void main(String[] args) {

		String s="Hello World";
		
		String str[]= s.split(" ");
		
		String reversalWord="";
		
		for(String st:str)
		{
			String rev="";
			for(int i=st.length()-1; i>=0; i--)
			{
				
				
				rev=rev+st.charAt(i);
				
			}
			
			reversalWord=reversalWord+rev+" ";
		}
		
		System.out.println(reversalWord);
		
		
	}

}
