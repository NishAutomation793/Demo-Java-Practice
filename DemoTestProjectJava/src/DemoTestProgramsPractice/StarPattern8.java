package DemoTestProgramsPractice;

/*
    *                            
   ***
  *****
 *******
*********

 */

public class StarPattern8 {
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) //Main for loop
		{
			
			for(int j=4; j>=i; j--)  //For Loop for Printing Space
			{
				
				System.out.print(" ");
				 
			}
			for(int k=1;k<=2*i-1; k++) // For Loop for Printing star
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
