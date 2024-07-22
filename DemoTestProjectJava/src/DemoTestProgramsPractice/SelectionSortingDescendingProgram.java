package DemoTestProgramsPractice;

public class SelectionSortingDescendingProgram {

	public static void main(String[] args) {

		// This is the program for Selection sorting where two things are done searching
		// for the smallest number and then sorting the higher number at first place

		int a[] = { 17, 15, 89, 67, 26, 56, 45 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {

					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}

			}

		}

		System.out.println("Selection Sorting in Descending Values are: ");

		for (int k = 0; k < a.length; k++) {

			System.out.println(a[k]);
		}

	}

}
