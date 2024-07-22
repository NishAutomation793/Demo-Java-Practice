package DemoTestProgramsPractice;

/**

 
 
1
121
12321
1234321
123454321

 */

public class NumberPattern5 {
	public static void main(String[] args) {

		for(int i=1; i<=5; i++) // Main Loop
		{
			
			for(int j=1; j<=i; j++)  // Loop for printing Main patterns
			{
				
				System.out.print(j);
			}
			for(int k=i-1; k>=1; k--)  // Loop for printing adjacent pattern
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
		
		
	}

}
