package DemoTestProgramsPractice;

import java.util.Collections;

public class BubbleSortingDesending {

	public static void main(String[] args) {
		
		int a[] = { 26, 18, 92, 10, 7, 15 };
		int temp;
		
		for (int i=0; i<a.length ; i++)
		{
			for(int j=0; j<a.length-1; j++ )
			{
				
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
						
				}
				
			}
			
			
		}
		
		System.out.println("Bubble Sort in descending is :");
		
		for(int i=0; i<a.length; i++)
		{
			
			System.out.print(a[i]+ " ");
			
		}
		
	}
	
}
