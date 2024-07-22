package DemoTestProgramsPractice;

import java.util.Arrays;

public class SquareOfSortedArrayNegativePositiveNumbers {

	public static void main(String[] args) {
		
		
		int ar[]= {-6,-2,3,4,6,9};
		int ar2[]=new int[ar.length];
		int temp=1;
		
		for(int i=0; i<ar.length; i++)
		{
			
			temp=ar[i]*ar[i];
			
			ar2[i]=temp;
			
		}
		
		System.out.println("Squared Array is : "+Arrays.toString(ar2));
		
	}
	
	
}
