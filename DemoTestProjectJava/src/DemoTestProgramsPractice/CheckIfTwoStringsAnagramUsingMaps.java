package DemoTestProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoStringsAnagramUsingMaps {

	public static void main(String[] args) {

		String s1 = "P O N G   AL  ";
		String s2 = "ON l P G A";

		char ch1[] = s1.toLowerCase().trim().replaceAll("\\s", "").toCharArray();
		char ch2[] = s2.toLowerCase().trim().replaceAll("\\s", "").toCharArray();

		Map<Character,Integer> map1=new HashMap<Character, Integer>();
		Map<Character,Integer> map2=new HashMap<Character, Integer>();

		for(int i=0; i<ch1.length; i++)
		{
			
			if (map1.get(ch1[i]) != null) {

				map1.put(ch1[i], map1.get(ch1[i]) + 1);

			} else {

				map1.put(ch1[i], 1);

			}

			
		}
		
		for(int i=0; i<ch2.length; i++)
		{
			
			if (map2.get(ch2[i]) != null) {

				map2.put(ch2[i], map2.get(ch2[i]) + 1);

			} else {

				map2.put(ch2[i], 1);

			}

	}
		
		
		if(map1.equals(map2))
		{
		System.out.println("Both Strings are Anagrams");	
		
		}
		else
		{
			
			System.out.println("Strings are not Anagrams");
		}
		}
}