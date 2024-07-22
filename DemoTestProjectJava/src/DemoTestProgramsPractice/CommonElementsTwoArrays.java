package DemoTestProgramsPractice;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsTwoArrays {

	public static void main(String[] args) {

		//This is the solution with normal for loops for finding common elements in two arrays
		
		
	int a1[]= {3,7,8,9};
	int a2[]= {7,9,2,6};
	
	Set<Integer> set=new HashSet<Integer>();

	for(int i=0; i<a1.length; i++)
	{
		
		for(int j=0; j<a2.length; j++)
		{
			
			if(a1[i]==a2[j])
			{
				set.add(a1[i]);
				
			}
			
		}
	}
	
	for(Integer a:set)
	{
		
		System.out.println("Common Elements in Both Arrays are: "+a);
		
	}
	
	
	}

}
