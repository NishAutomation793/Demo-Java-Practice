package DemoTestProgramsPractice;

public class PrintWhetherNumIsEvenOdd {

	public static void main(String[] args) {

		int a=19;
		
		if(a>0 && a!=0)
		{
			System.out.println("Number is Positive");
			
			if(a%2==0)
			{
				System.out.println(+a+" is the Even Number");
				
			}
			else
			{
				System.out.println(+a+" is the Odd Number");
			}
			
		}
		
		else if(a==0)
		{
			System.out.println("Number is neither Postive or Negative..Its zero");
			
			
		}
		else
		{
			
			System.out.println("Number is Negative");
		}
		
		
		
	}

}
