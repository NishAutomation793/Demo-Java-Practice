package DemoTestProgramsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FetchingFirstNonRepeatedCharacterinString {

	public static void main(String[] args) {

		String str = "PISISZIPPI";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) 
		{

			if (map.get(ch[i]) != null) {

				map.put(ch[i], map.get(ch[i]) + 1);

			} else {

				map.put(ch[i], 1);

			}

		}
		
		//To print entire Map with Key and Value Pairs :
		
		for(Map.Entry<Character,Integer> m:map.entrySet())
		{
			
			System.out.println("Key is: "+m.getKey()+ " Count is: "+m.getValue());
			if(m.getValue()==1)
			{
				System.out.println("Key for First Non Duplicate Value is: "+m.getKey());
				
			}
			
		}

	}

}
