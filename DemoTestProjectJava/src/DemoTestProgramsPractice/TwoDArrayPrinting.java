package DemoTestProgramsPractice;

public class TwoDArrayPrinting{
	
	public static void main(String[] args) {
		

		
	int a[][]= {{4,5,6},{10,12},{20,21,22}};

	
	for ( int i=0; i<a.length; i++)
	{
		System.out.println("Row "+i+" Values are:");
		
		for( int j=0; j<a[i].length; j++)
		{	
			
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}

}


}
