package DemoTestProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class PrintElementThatAppearsOnceinArray {

	public static void main(String[] args) {

		// Print the element that appears once in the array and rest element appears
		// twice

		int a[] = { 3, 8, 9, 8, 10, 7, 9 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : a) {

			Integer count = map.get(i);

			if (count == null) {

				map.put(i, 1);

			}

			else {
				count++;

				map.put(i, count);

			}

		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {

				System.out.println("Key is: " + entry.getKey() + " Count Value is: " + entry.getValue());
			}

		}

	}

}
