package DemoTestProgramsPractice;

public class LinearSearchIntegers {

	
	public static void main(String[] args) {
		
		int arr[]= {4,6,10,8,17,9};
		int num=81;
		
		int temp=0;
		
		for(int i=0; i<arr.length; i++)
		{
			
			if(arr[i]==num)
			{
				System.out.println("Element is present at "+i+ " Position");
				temp=temp+1;
				
				break;
			}
				
		}
		
		if(temp==0)
		{
			
			System.out.println("Element is not found in the list");
		}
	}
	
	
}
