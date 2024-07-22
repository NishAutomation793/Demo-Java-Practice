package DemoTestProgramsPractice;

public class FindingMaxNumberArray {
	
	public static void main(String[] args) {
		
		int a[]= {4,19,8,10,27,29};
		
		int max=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			
			if(a[i]>max)
			{
				
				max=a[i];
				
			}
			
		}
		
		System.out.println("Maximum Value for the Array is: "+max);
		
		
		
	}

}
