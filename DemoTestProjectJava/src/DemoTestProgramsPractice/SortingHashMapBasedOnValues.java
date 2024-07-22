package DemoTestProgramsPractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortingHashMapBasedOnValues {
/**
 * The idea is to store the entry set in a list and sort the list on the basis of values. Then fetch values and keys from the list and put them in a new hashmap. 
 * Thus, a new hashmap is sorted according to values.
 * @param args
 */
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> fruitMap = new HashMap<Integer, String>();
		fruitMap.put(10, "Mango");
		fruitMap.put(22, "Pears");
		fruitMap.put(13, "Apple");
		fruitMap.put(24, "Kerela");
		fruitMap.put(15, "Banana");
		
		List<Map.Entry<Integer, String> > list =
	               new LinkedList<Map.Entry<Integer,String> >(fruitMap.entrySet());
	
		
		// Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() {
            public int compare(Map.Entry<Integer, String> o1, 
                               Map.Entry<Integer, String> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
		
        // put data from sorted list to hashmap 
       
        for (Map.Entry<Integer,String> aa : list) {
        
        	System.out.println(aa.getKey());

        	System.out.println("Values Sorted : "+aa.getValue());
        	
        }
	}}
