package DemoTestProgramsPractice;

public class PrintVowelsConsonantsSTring {
	
	public static void main(String[] args) {
		
		
		String s="My Name is Owl";
		s=s.toLowerCase().replaceAll("\\s", "");
		int vowelsCount=0;
		int consCount=0;
		
		for(int i=0; i<s.length(); i++)
			
		{
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u')

			{
				System.out.println("Vowel is : "+s.charAt(i));
				vowelsCount++;
				
			}
			
			else
			{	System.out.println("Cons Is: "+s.charAt(i));

				consCount++;
				
			}
		}
		
		System.out.println("Total Vowels are : "+vowelsCount +" Total Consonants are : "+consCount);
		
		
	}

}
