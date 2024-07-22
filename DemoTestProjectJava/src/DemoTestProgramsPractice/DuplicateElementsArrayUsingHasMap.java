package DemoTestProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsArrayUsingHasMap {

	public static void main(String[] args) {

		int a[] = { 3, 8, 9, 3, 7, 8, 10, 10 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : a) {

			Integer count = map.get(i);
			if (count == null) {

				map.put(i, 1);
			} else {
				count = count + 1;
				map.put(i, count);

			}

		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) // To print only values having count greater then 1.
			{

				System.out.println("Number is: " + entry.getKey() + " Count is: " + entry.getValue());
			}
		}

	}

}
