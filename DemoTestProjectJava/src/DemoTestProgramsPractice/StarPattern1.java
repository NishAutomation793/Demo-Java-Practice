package DemoTestProgramsPractice;

public class StarPattern1 {

	public static void main(String[] args) {

		/**
		 * Expected Output to print is:
		 * 
		 *             *
		 *             **
		 *             ***
		 *             ****
		 *             *****
		 *             ******
		 */
		
		
	for(int i=1; i<=6; i++)
	{
		
		for(int j=1; j<=i; j++)
		{
			System.out.print("*");
			
		}

		System.out.println();
	}
		
		
	}

}
