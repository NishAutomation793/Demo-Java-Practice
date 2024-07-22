package DemoTestProgramsPractice;

import java.util.Arrays;

public class ProgramToMoveAllZeroesToEndOfArray {

	public static void main(String[] args) {

		int a[]= {10,20,0,29,0,30,40};
		
		int temp[]=new int[a.length];
		int j=0;
		
		for(int i =0; i<a.length; i++)
		{
			
			if(a[i]!=0)
			{
			temp[j]=a[i];
			j++;
				
			}
		}
		
		System.out.println(Arrays.toString(temp));
	}

}
