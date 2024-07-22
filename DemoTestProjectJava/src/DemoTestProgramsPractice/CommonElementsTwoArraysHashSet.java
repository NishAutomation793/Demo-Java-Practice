package DemoTestProgramsPractice;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsTwoArraysHashSet {

//In this first we have added all the values from array1 and when we try to add 
//the values from arrays2 in same set then due to property of set it can't store duplicate values we printed the same.	
	
	public static void main(String[] args) {

		
		int a1[]= {3,7,8,9};
		int a2[]= {7,9,2,6};
		
		
		Set<Integer> set1=new HashSet<Integer>();
		
		for(int i:a1)
		{
			set1.add(i);
			
		}
		
		for(int i2:a2)
		{
			if(!set1.add(i2))
			{
				
				System.out.println("Common Elements in two Arrays are: "+i2);
				
			}
			
			
		}
	}

}
