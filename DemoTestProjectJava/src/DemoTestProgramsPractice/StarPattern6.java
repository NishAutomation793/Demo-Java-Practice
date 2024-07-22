package DemoTestProgramsPractice;


public class StarPattern6 {
	
/**
 *                           *
 *                          **
 *                         ***
 *                        ****
 *                       *****
 *                        ****
 *                         ***
 *                          **
 *                           *    
 * 
 * 
 * @param args
 */
	
	
public static void main(String[] args) {

	for (int i = 1; i <= 5; i++) //Main for Loop
	{

		for (int j = 4; j >= i; j--) //For loop for printing spaces
		{

			System.out.print(" ");
		}

		for (int k = 1; k <= i; k++) // For Loop for printing stars 
		{

			System.out.print("*");
		}

		System.out.println();

	}
	
	
	for(int i=1; i<=4; i++)  // Again new for loop for printing lowest pattern
	{
		
		for(int j=1; j<=i; j++)  // For Loop for printing spaces
		{
			System.out.print(" ");
			
			
		}
		for(int k=4; k>=i; k--)  // For Loop for Printing stars
		{
			
			System.out.print("*");
		}
		
		System.out.println();
		
		
	}

}

}
