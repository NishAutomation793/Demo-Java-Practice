package DemoTestProgramsPractice;

import java.util.Arrays;

public class ProgramToMoveNonNegativeElementsStartOfArray {

	public static void main(String[] args) {
		
		int a[]= {4,8,-9,-6,10,12,-7,5};
		
		int temp[]=new int [a.length];
		int j=0;
		
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i]<0)
			{
				
				temp[j]=a[i];
				j++;
			}
			
		}
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i]>0)
			{
				
				temp[j]=a[i];
				j++;
			}
			
		}
		
		System.out.println("After Moving All Non Negative Elemets to Start of Array is: "+Arrays.toString(temp));
	}
	
}
