package DemoTestProgramsPractice;

public class SumOfFirstLastDigitOfNumber {
	public static void main(String[] args) {
		
		
		int num=153;
		int temp=num;
		
		int lastDigit=0;
		int firstDigit=num;
		
		lastDigit=temp%10;
		while(firstDigit>=10)
		{
			
			firstDigit=firstDigit/10;
			
		}
		
		System.out.println("Sum of First and Last Digit Of Number Is: "+(firstDigit+lastDigit));
		
	}

}
