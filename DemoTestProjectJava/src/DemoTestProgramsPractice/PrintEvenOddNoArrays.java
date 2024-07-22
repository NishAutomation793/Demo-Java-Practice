package DemoTestProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintEvenOddNoArrays {

// Here we have three requirement :
	// To print odd and even numbers
	// Count of even and odd nos
	// Sum of even and odd nos.
	public static void main(String[] args) {

		int a[] = { 4, 8, 19, 7, 6, 10, 3 };

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		int sumEven = 0;
		int sumOdd = 0;
		for (int arr : a) 
		{
			if (arr % 2 == 0) 
			{
				even.add(arr);
				sumEven = sumEven + arr;

			} else {
				odd.add(arr);
				sumOdd = arr + sumOdd;

			}
		}
		
		System.out.println("Even Numbers are :" +even);
		System.out.println("Odd Numbers are :" +odd);
		
		System.out.println("Count of Even nos: "+even.size());
		System.out.println("Count of Odd nos: "+odd.size());
		
		System.out.println("Sum of Even Nos are: "+sumEven);
		System.out.println("Sum of Odd Nos are: "+sumOdd);



	}
}
