package DemoTestProgramsPractice;

public class PrintDigitsCharsSpaecialCharsSeparately {
	
	public static void main(String[] args) {
		
		String s="My Name is  %$#W#$ 998 lulu";
		
		char ch[]=s.toCharArray();
		
		int digit=0;
		int cha=0;
		int spaces=0;
		int special_Chars=0;
		
		for(char c :ch)
		{
			
			if(Character.isDigit(c))
			{
				
				digit++;
			}
			else if(Character.isSpaceChar(c))
			{
				
				spaces++;
			}
			
			else if(Character.isAlphabetic(c))
			{
				cha++;
				
			}
			
			else
			{
				
				special_Chars++;
			}
			
		}
		
		System.out.println("Total Counts in the string "+s +" is " + " Digits == " +digit + " Alphabets = "+cha + " Spaces are = "+spaces + " Special Chars are =" +special_Chars);

		
	}

}
