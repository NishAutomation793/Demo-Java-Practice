package DemoTestProgramsPractice;

public class RemovingJunkSpecialCharsString {

	public static void main(String[] args) {

// Part 1: --> Replacing all the special and junk chars from the String
		
		String s="&#@!@#$%^& Nishant Is Good";
		
		String s1=s.replaceAll("[^a-zA-Z0-9 ]", ""); // This carrat sign means except this reg ex replace everything
		
	System.out.println("String after junk and special chars removal is: "+s1);	
	
	
//Part 2: --> Removing white spaces from the string
	
	String s2=s1.replaceAll("\\s","");
	
	System.out.println("String after White Spaces removal is: "+s2);	

		
	}

}
