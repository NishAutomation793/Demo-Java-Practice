package DemoTestProgramsPractice;

import java.util.Arrays;

/**
 * Median represents the Middle of the element of array
 */

public class FindMedianOfArray {

	public static void main(String[] args) {
		
		int ar[]= {4,10,18,7,9,6};
		
		Arrays.sort(ar);
		System.out.println("Sorted Array is : "+Arrays.toString(ar));
		
		int length=ar.length;
		
		if(length%2==1)
		{
			length=(ar.length/2);
			
		}
		else
		{
			
			length=(((ar.length-1/2)+ar.length/2))/2;
			
		}
		
		System.out.println("Median Is : "+length);
		
	}
	
}
