package DemoTestProgramsPractice;

public class FindMissingNoArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6,7};
		
		int expectedSize=a.length+1;
		int actualSum=0;
		
		int expectedSum=(expectedSize*(expectedSize+1))/2;
		
		for(int i=0; i<a.length;i++)
		{
			
			actualSum=actualSum+a[i];
			
		}
		
		System.out.println("Missing Number is: "+(expectedSum-actualSum));
		
		
		
		
	}

}
