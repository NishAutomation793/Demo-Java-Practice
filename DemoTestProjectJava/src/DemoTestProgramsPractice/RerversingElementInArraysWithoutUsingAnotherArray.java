package DemoTestProgramsPractice;

import java.util.Arrays;

public class RerversingElementInArraysWithoutUsingAnotherArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

//Using Another Array		
		
//		int a2[]=new int[a.length];
//		int j=0;
//		
//		for(int i=a.length-1; i>=0; i--)
//		{
//			a2[j]=a[i];
//			j++;
//		}
//		
//	System.out.println("Reversed Array is: "+Arrays.toString(a2));	

		int temp = 0;

		int low = 0;
		int high = a.length - 1;

		while (low <= high) 
		{
			temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			

			low++;
			high--;

		}
		System.out.println("Reversed Array is: "+Arrays.toString(a));	
	}

}
