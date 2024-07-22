package DemoTestProgramsPractice;

public class PrintEvenOddNumberArray {

	public static void main(String[] args) {

		int a[]= {4,8,7,19,10,11,15};
		
		for(int i=0; i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				
				System.out.println("Even  Number is : " +a[i]);
			}
			else
			{
				System.out.println("Odd  Number is : " +a[i]);
				
			}
		}

	
		
		
	}

}
