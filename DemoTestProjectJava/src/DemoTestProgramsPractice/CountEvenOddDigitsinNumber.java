package DemoTestProgramsPractice;

public class CountEvenOddDigitsinNumber {

	public static void main(String[] args) {

		int num=3456789;
		int rev=0;
		int odd=0;int even=0;
		
		while(num!=0)
		{
			rev=num%10;
			if(rev%2==0)
			{
				even++;
				
			}
			else
			{
				odd++;
			}
			
			num=num/10;
		}
		
	System.out.println("Even Digits in Number is: "+even+ " Odd Digits in a Number is: "+odd);	
		
		
	}

}
