package DemoTestProgramsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FiveWaysToIterateHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> fruitMap=new HashMap<Integer, String>();
		fruitMap.put(1,"Mango");
		fruitMap.put(2,"Pears");
		fruitMap.put(3,"Apple");
		fruitMap.put(4,"Kerela");
		fruitMap.put(5,"Banana");
		
		//fruitMap.keySet() --> This will return all the keys value
		// fruitMap.values() --> It will print all values of the map

		// First Method : Using Keyset
		
		for(Integer fruitId: fruitMap.keySet())
		{
			System.out.println("ALl keys are : "+fruitId);
			System.out.println("All Values are : "+fruitMap.get(fruitId));
			
		}
		
		// Second Method : Using Iterator
System.out.println("Second Method of Iterate HashMap *****************");		
		Iterator <Map.Entry<Integer, String>> it=fruitMap.entrySet().iterator();
		
		while(it.hasNext())
		{
			
			Map.Entry<Integer, String> map=it.next();
			
			System.out.println("Keys are:" +map.getKey());
			System.out.println("Values are:" +map.getValue());

		}
		
		
		System.out.println("Third Method of Iterate HashMap *****************");		
	// Third Method : Using Entryset
		
		for(Map.Entry<Integer,String> map: fruitMap.entrySet())
		{
			System.out.println("Keys are:" +map.getKey());
			System.out.println("Values are:" +map.getValue());

			
			
		}
	}
	
}
