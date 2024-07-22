package DemoTestProgramsPractice;

public class FindingMinNumberArray {
	
	
	public static void main(String[] args) {
		
	int a[]= {7,19,10,8,2,33};
	
	int min=a[0];
	
	for(int i=1; i<a.length; i++)
	{
		if(a[i]<min)
		{
			
			min=a[i];
		}
		
	}
	
	System.out.println("Minimum Value from the Array is: "+min);

}
}