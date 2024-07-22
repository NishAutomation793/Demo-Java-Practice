package DemoTestProgramsPractice;

import java.util.Arrays;

public class ReversingElementsInArray {

	public static void main(String[] args) {

		int a[] = { 3, 8, 0, 19, 17, 11, 10 };
		int temp = 0;
		int start = 0;
		int last = a.length - 1;

		while (start < last)  //Loop should work till the index value of are not equal 
		{
			temp = a[start];
			a[start] = a[last];
			a[last] = temp;
			
			start++;
			last--;

		}

		System.out.println("Reversing Array is: " + Arrays.toString(a));

	}

}
