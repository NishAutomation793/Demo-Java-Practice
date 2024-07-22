package DemoTestProgramsPractice;

import java.util.Arrays;

public class MergeTwoSortedArrayIntoThird {

	public static void main(String[] args) {


		int a1[]= {2,3,4,5,6};
		int a2[]= {7,8,9,10,11};
		
		
		int a3[]=new int [a1.length+a2.length];
		
		for(int i=0; i<a1.length; i++)
		{
			
			a3[i]=a1[i];
					
			
		}
		for(int i=0; i<a2.length; i++)
		{
			
			a3[a1.length+i]=a2[i];
					
			
		}
		
		System.out.println("Merged and Sorted Third Array is : "+Arrays.toString(a3));
		
	}

}
