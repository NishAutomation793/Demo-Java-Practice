package DemoTestProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterInString {

	public static void main(String[] args) {

	String s="MISSISIPPI";
	int maxCount=0;
    char ch=' ';
	
	Map<Character,Integer> map=new HashMap<Character, Integer>();
	
	
	for(int i=0; i<s.length(); i++)
	{
		
		if(map.containsKey(s.charAt(i)))
		{
			map.put(s.charAt(i),map.get(s.charAt(i))+1);
		}
		else
		{
			
			map.put(s.charAt(i),1);
	
		}
			
	}
	

	for(Map.Entry<Character,Integer> entry : map.entrySet())
	{
		
		System.out.println(entry.getKey()+ " "+entry.getValue());
		
		if(entry.getValue()>maxCount)
		{
			maxCount=entry.getValue();
			ch=entry.getKey();
		}
		
	}

	System.out.println("The Character with Max value is:  "+ch +" And count is : "+maxCount);
	
	}

}
