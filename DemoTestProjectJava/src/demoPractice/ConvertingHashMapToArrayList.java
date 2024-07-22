package demoPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertingHashMapToArrayList {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Nishant", 39);
		map.put("Aman", 89);
		map.put("Nish", 69);
		map.put("Manish", 19);
		map.put("Mamta", 59);

		List<String> nameList = new ArrayList<String>(map.keySet());

		System.out.println("Keys are :" + nameList);

		List<Integer> valueList = new ArrayList<Integer>(map.values());

		System.out.println("Value are: " + valueList);

	}

}
