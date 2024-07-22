package DemoTestProgramsPractice;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsThreeArrays {

	public static void main(String[] args) {

		int a1[] = { 4, 6, 7, 8, 9, 6 };
		int a2[] = { 4, 8, 10, 16, 17 };
		int a3[] = { 10, 17, 8, 15 };
		
		Set<Integer> set=new HashSet<Integer>();

		for (int i = 0; i < a1.length; i++) 
		{

			for (int j = 0; j < a2.length; j++) 
			{

				for (int k = 0; k < a3.length; k++) 
				{

					if ((a1[i] == a2[j]) && (a1[i] == a3[k]))
					{
                        set.add(a1[i]);
					}

				}
			}

		}
		
		for(int i:set)
		{
			
			System.out.println("Common Eelement in Three Arrays are: "+i);
			
		}

	}

}
