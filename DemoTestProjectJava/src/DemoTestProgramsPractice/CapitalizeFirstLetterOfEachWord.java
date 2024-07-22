package DemoTestProgramsPractice;

public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {

		String s = "this is my name";

		String fnl = "";
		

		String str[] = s.split(" ");

		
		for(int i=0; i<str.length; i++)
		{
			String word=str[i];
			
			char ch[]=word.toCharArray();

           String c=String.valueOf(ch[0]);
			
            String capitalWord=c.toUpperCase();
            
            for(int j=1; j<ch.length; j++)
            {
            	capitalWord=capitalWord+ch[j];
            	
            }
			
			fnl=fnl+capitalWord+" ";
		}
		
		
		
		System.out.println("Final String is: "+fnl);

	}
}
