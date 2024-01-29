package stringConcept;

public class StringCountLetters {

	int count=0;
	public boolean countLetters(String str)
	{
		for( int i=0; i<str.length(); i++)
		{
			
			if(str.charAt(i)=='e')
			{
				count =count+1;

			}
			
		}
		if(count>=1&&count<=3)
		{
		return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		StringCountLetters st= new StringCountLetters();
		Boolean boo=st.countLetters("Heelele");
		System.out.println("Value of Count is "+st.count + " " +boo);
		
	}

}
