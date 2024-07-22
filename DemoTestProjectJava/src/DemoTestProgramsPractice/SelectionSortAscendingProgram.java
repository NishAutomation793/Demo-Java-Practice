package DemoTestProgramsPractice;

public class SelectionSortAscendingProgram {

	public static void main(String[] args) {
		
		//This is the program for Selection sorting where two things are done searching for the smallest numner and then sorting it at first place
		
		
	int a[]= {17,15,89,67,26,56,45};	
		
	int temp=0;
	
	for(int i=0; i<a.length; i++)
	{
	
		
		for(int j=i+1; j<a.length; j++)
		{
		
			if(a[i]>a[j])
			{
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
		
		}
		}
	
	
	System.out.println("Selection Sorted Values are: ");
	for(int k=0; k<a.length; k++)
	{
		
		System.out.println(a[k]);
	}
		
		
	
}
	
	}
