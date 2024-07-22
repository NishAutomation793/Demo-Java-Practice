package DemoTestProgramsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMapBasedOnKeys {

	public static void main(String[] args) {
		Map<Integer, String> fruitMap = new HashMap<Integer, String>();
		fruitMap.put(10, "Mango");
		fruitMap.put(22, "Pears");
		fruitMap.put(13, "Apple");
		fruitMap.put(24, "Kerela");
		fruitMap.put(15, "Banana");

//If we want to sort the Hashmap based on Keys then we can use the TreeMap since it is extending the sorted Map

		Map<Integer, String> treeMap = new TreeMap<Integer, String>(fruitMap);

		for (Map.Entry<Integer, String> map : treeMap.entrySet()) {
			System.out.println("Sorted Keys are:" + map.getKey());
			System.out.println("Values are:" + map.getValue());
		}

	}

}
