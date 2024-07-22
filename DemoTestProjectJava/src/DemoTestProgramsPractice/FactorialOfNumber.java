package DemoTestProgramsPractice;

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		
		int number=6;
		int fact=1;
		
		for(int i=number; i>=1; i--)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of the number " +number+ " is " +fact );
		
		
	}

}
