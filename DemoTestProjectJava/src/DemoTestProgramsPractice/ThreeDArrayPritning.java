package DemoTestProgramsPractice;

public class ThreeDArrayPritning {
	
	
public static void main(String[] args) {
	
	
	int a[][][]= {{{10,12,17}, {20,23,25}, {34,37,39}}};
	
	
	for ( int i=0; i<a.length; i++)
	{
		System.out.println("Row Number is: "+i);
		
		for( int j=0; j<a[i].length;j++)
		{
			
			for( int k =0; k<a[i][j].length;k++)
			{
				
				System.out.print(a[i][j][k]+ " ");//
				
			}
			
			System.out.println();
		}
			
	}
	
}

}
