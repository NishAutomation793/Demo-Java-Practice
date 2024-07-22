package DemoTestProgramsPractice;

public class SecondSmallestNumberArray {

	public static void main(String[] args) {
		int arr[] = { 7, 19,9, 20, 18, 16, 22 };

		int temp;

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

			if (i == 1) {

				break;
			}

		}

		System.out.println("Second Smallest Number is :" + arr[1]);

	}
	}

