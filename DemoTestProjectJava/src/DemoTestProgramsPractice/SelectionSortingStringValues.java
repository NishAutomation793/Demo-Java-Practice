package DemoTestProgramsPractice;

public class SelectionSortingStringValues {

	public static void main(String[] args) {

		String str[] = { "Deepak", "Nishant", "Mahesh", "Nishant", "Raja", "Akshay" };

		String temp;

		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;

				}

			}

		}

		System.out.println("Selection Sorted String Values are: ");

		for (int i = 0; i < str.length; i++) {

			System.out.println(str[i]);
		}

	}

}
