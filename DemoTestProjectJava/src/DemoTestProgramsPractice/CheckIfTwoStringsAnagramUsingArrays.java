package DemoTestProgramsPractice;

import java.util.Arrays;

/**
 * To check this use case we have two ways :
 * 1. First way is we can store the key and value pairs of both string inside the map and and then we can compare both the maps using map1.equals(map2)
 * 2. Second way we can first sort both the arrays and then check using Arrays.equal method 
 *
 */

public class CheckIfTwoStringsAnagramUsingArrays {
	
	
	public static void main(String[] args) {
		
		String s1="P O N G   AL  ";
		String s2="ON l P G A";
		
		char ch1[]=s1.toLowerCase().trim().replaceAll("\\s","").toCharArray();
		char ch2[]=s2.toLowerCase().trim().replaceAll("\\s","").toCharArray();

		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			
			System.out.println("Both Strings are Anagrams");
			
			
		}
		else
		{
			
			System.out.println("Both Strings are not Anagrams");
			
		}
		
		
		
	}
	

}
