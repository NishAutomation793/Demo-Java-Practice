package DemoTestProgramsPractice;

import java.util.Arrays;
import java.util.Collections;

public class ReversingElementInArray {

	public static void main(String[] args) {
		
		int a[]= {6,9,10,14,20};
		int a2[]=new int[a.length];
		
		int index=0;
	
//		Arrays.sort(a,Collections.reverseOrder());
//			
//		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1; i>=0; i--)
		{
			a2[index]=a[i];
			index++;
		}
		
		System.out.println(Arrays.toString(a2));
	}
	
}
