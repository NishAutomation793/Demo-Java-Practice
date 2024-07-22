package DemoTestProgramsPractice;

/**
 * 
 * Here we have to print the Pairs from the Arrays which gives submition as 50 
 */
public class PrintPairsfromArrays {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int sum=50;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
			if(a[i]+a[i+1]==sum)
			{
				System.out.println(a[i] + " "+a[j] );
				
			}
			}

		
	}
	}
	}
