package DemoTestProgramsPractice;

import java.util.Arrays;

public class RightRotateElementOfArrayByOne {

	public static void main(String[] args) {

int a[]= {10,20,30,40,50};
		
		int temp=a[a.length-1];
		
		
		for(int i=0; i<a.length-1; i++)

		{
			a[a.length-1-i]=a[a.length-2-i];
			
		}
		
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}
		
		
	}

