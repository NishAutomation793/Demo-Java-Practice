package DemoTestProgramsPractice;

/**

 **********
  *******
   *****
    ***
     *
 */




public class StarPattern9 {

	public static void main(String[] args) {

	for(int i=1; i<=6; i++) // Main loop for printing Rows
	{
		
		for(int k=1; k<=i; k++)  // For Printing spacings
		{
			
			System.out.print(" ");
		}
		
		for(int j=9; j>=2*i-1; j--)  // For Printing Actual Stars
		{
			
			System.out.print("*");
		}
		
		
		System.out.println();
		
	}
		
		
		
	}

}
